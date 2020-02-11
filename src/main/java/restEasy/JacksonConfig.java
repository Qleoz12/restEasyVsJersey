package restEasy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

@Provider
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class JacksonConfig implements ContextResolver<ObjectMapper> {

    private final ObjectMapper objectMapper;

    public JacksonConfig() {        
        objectMapper = new ObjectMapper();
        // no llene campos en null o vacios 
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        // no falle con campos que no estan en el dto que se espera
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //LocalDateTime
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        
        LocalDateTimeDeserializer localDateTimeDeserializer = new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        LocalDateTimeSerializer localDateTimeSerializer = new LocalDateTimeSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        
        // por si quisieramos modificar el formato de las fechas
        //
        //objectMapper.setDateFormat(new SimpleDateFormat("dd.MM.yyyy"));
        //objectMapper.configure(SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS, false);
        //
        // ahora viene la implementación para filtrar algunas entidades
        // los serializers que se registre son globales
        SimpleModule module = new SimpleModule("RESTModule", new Version(1, 0, 0, null));
        module.addDeserializer(LocalDateTime.class, localDateTimeDeserializer);
        module.addSerializer(LocalDateTime.class, localDateTimeSerializer);
// 		module.addSerializer(Pais.class, new PaisSerializer());
//        module.addSerializer(Departamento.class, new DepartamentoSerializer());
//        module.addSerializer(Municipio.class, new MunicipioSerializer());
//        module.addSerializer(ParqueaderosYZona.class, new ParqueaderosYZonaSerializer());
//        module.addSerializer(ParqueaderosYZonaDTO.class, new ParqueaderosYZonaDTOSerializer());
//        module.addSerializer(ParqueaderosYZonasTiposDeCelda.class, new ParqueaderosYZonasTiposDeCeldaSerializer());
//        module.addSerializer(Estado.class, new EstadoSerializer());
//        module.addSerializer(TipoDemarcacion.class, new TipoDemarcacionSerializer());
//        module.addSerializer(HorarioDTO.class, new HorarioDTOSerializer());
//        module.addSerializer(DetalleHorarioDTO.class, new DetalleHorarioDTOSerializer());
//        module.addSerializer(Convenio.class, new ConvenioSerializer());
//        module.addSerializer(TipoConvenio.class, new TipoConvenioSerializer());
//        module.addSerializer(TipoValidacion.class, new TipoValidacionSerializer());
//        module.addSerializer(CeldaTiposDeVehiculo.class, new CeldaTiposDeVehiculoSerializer());
//        module.addSerializer(TiposDeCelda.class, new TiposDeCeldaSerializer());
//        module.addSerializer(Ticket.class, new TicketSerializer());
//        module.addSerializer(DetalleTicket.class, new DetalleTicketSerializer());
//        module.addSerializer(Tarifa.class, new TarifaSerializer());
//        //objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
//        //objectMapper.setDateFormat(new ISO8601DateFormat());
//        module.addSerializer(Time.class, new CustomSqlTimeSerializer());
//        module.addSerializer(Date.class, new CustomDateSerializer());
//        module.addSerializer(TarjetasPrepagoTO.class, new TarjetasPrepagoTOSerializer());
//        module.addSerializer(Pin.class, new PinPagoSerializer());        
//        module.addSerializer(ValorCaracteristica.class, new ValorCaracteristicaSerializer());
//        module.addSerializer(Venta.class, new VentaSerializer());
//        module.addSerializer(ProductoVenta.class, new ProductoVentaSerializer());
       
        
        objectMapper.registerModule(module);
    }

    public ObjectMapper getContext(Class<?> type) {
        return objectMapper;
    }
}