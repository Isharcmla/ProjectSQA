import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializer;

import java.io.StringWriter;
import java.util.Date;

public class StdKeySerializerTest {

    private StdKeySerializer serializer;
    private ObjectMapper mapper;
    private SerializerProvider provider;
    private JsonFactory jsonFactory;

    @Before
    public void setUp() {
        serializer = new StdKeySerializer();
        mapper = new ObjectMapper();
        provider = mapper.getSerializerProviderInstance();
        jsonFactory = new JsonFactory();
    }

    @Test
    public void testConstructor_createsInstance_notNull() {
        StdKeySerializer s = new StdKeySerializer();
        assertNotNull(s);
    }

    @Test
    public void testSerialize_stringValue_writesFieldNameCorrectly() throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        gen.writeStartObject();
        serializer.serialize("myKey", gen, provider);
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.close();
        assertEquals("{\"myKey\":1}", sw.toString());
    }

    @Test
    public void testSerialize_nonStringObjectValue_usesToStringAsFieldName() throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        gen.writeStartObject();
        serializer.serialize(Integer.valueOf(42), gen, provider);
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.close();
        assertEquals("{\"42\":1}", sw.toString());
    }

    @Test
    public void testSerialize_emptyStringValue_writesEmptyFieldName() throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        gen.writeStartObject();
        serializer.serialize("", gen, provider);
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.close();
        assertEquals("{\"\":1}", sw.toString());
    }

    @Test
    public void testSerialize_dateValue_delegatesToDefaultSerializeDateKey() throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        gen.writeStartObject();
        serializer.serialize(new Date(0L), gen, provider);
        gen.writeNumber(1);
        gen.writeEndObject();
        gen.close();
        String result = sw.toString();
        assertNotNull(result);
        assertTrue(result.length() > 0);
        // A field name must have been written before the value 1
        assertTrue(result.contains(":1}"));
    }

    @Test(expected = NullPointerException.class)
    public void testSerialize_nullValue_throwsNullPointerException() throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        gen.writeStartObject();
        serializer.serialize(null, gen, provider);
    }

    @Test
    public void testGetSchema_withNullTypeHint_returnsStringSchemaNode() throws Exception {
        JsonNode schema = serializer.getSchema(provider, null);
        assertNotNull(schema);
        assertTrue(schema.toString().toLowerCase().contains("string"));
    }

    @Test
    public void testGetSchema_withNonNullTypeHint_returnsStringSchemaNode() throws Exception {
        JsonNode schema = serializer.getSchema(provider, String.class);
        assertNotNull(schema);
        assertTrue(schema.toString().toLowerCase().contains("string"));
    }

    @Test(expected = NullPointerException.class)
    public void testAcceptJsonFormatVisitor_nullVisitorWithValidType_throwsNullPointerException() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        serializer.acceptJsonFormatVisitor(null, type);
    }

    @Test(expected = NullPointerException.class)
    public void testAcceptJsonFormatVisitor_nullVisitorAndNullTypeHint_throwsNullPointerException() throws Exception {
        serializer.acceptJsonFormatVisitor(null, null);
    }
}
