package com.fasterxml.jackson.databind.deser.std;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.node.BinaryNode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FromStringDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    @Test
    public void testTypes_returnsExpectedSupportedClasses() {
        Class<?>[] types = FromStringDeserializer.types();
        Assert.assertNotNull(types);
        Assert.assertEquals(12, types.length);
        Assert.assertEquals(File.class, types[0]);
        Assert.assertEquals(URL.class, types[1]);
        Assert.assertEquals(URI.class, types[2]);
        Assert.assertEquals(Class.class, types[3]);
        Assert.assertEquals(JavaType.class, types[4]);
        Assert.assertEquals(Currency.class, types[5]);
        Assert.assertEquals(Pattern.class, types[6]);
        Assert.assertEquals(Locale.class, types[7]);
        Assert.assertEquals(Charset.class, types[8]);
        Assert.assertEquals(TimeZone.class, types[9]);
        Assert.assertEquals(InetAddress.class, types[10]);
        Assert.assertEquals(InetSocketAddress.class, types[11]);
    }

    @Test
    public void testFindDeserializer_allSupportedTypes_returnsNonNull() {
        for (Class<?> type : FromStringDeserializer.types()) {
            FromStringDeserializer.Std deser = FromStringDeserializer.findDeserializer(type);
            Assert.assertNotNull("Deserializer for " + type.getName() + " should not be null", deser);
            Assert.assertEquals(type, deser.getValueClass());
        }
    }

    @Test
    public void testFindDeserializer_unsupportedType_returnsNull() {
        Assert.assertNull(FromStringDeserializer.findDeserializer(String.class));
        Assert.assertNull(FromStringDeserializer.findDeserializer(Integer.class));
        Assert.assertNull(FromStringDeserializer.findDeserializer(Object.class));
    }

    @Test
    public void testDeserialize_file() throws Exception {
        File file = mapper.readValue("\"/tmp/test.txt\"", File.class);
        Assert.assertNotNull(file);
        Assert.assertEquals(new File("/tmp/test.txt"), file);

        File emptyFile = mapper.readValue("\"   \"", File.class);
        Assert.assertNull(emptyFile);
    }

    @Test
    public void testDeserialize_url() throws Exception {
        URL url = mapper.readValue("\"http://localhost:8080/test\"", URL.class);
        Assert.assertNotNull(url);
        Assert.assertEquals("http://localhost:8080/test", url.toExternalForm());

        URL emptyUrl = mapper.readValue("\"\"", URL.class);
        Assert.assertNull(emptyUrl);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_url_malformed() throws Exception {
        mapper.readValue("\"not_a_valid_url\"", URL.class);
    }

    @Test
    public void testDeserialize_uri() throws Exception {
        URI uri = mapper.readValue("\"http://localhost:8080/path?query=1\"", URI.class);
        Assert.assertNotNull(uri);
        Assert.assertEquals("http://localhost:8080/path?query=1", uri.toString());

        URI emptyUri = mapper.readValue("\"\"", URI.class);
        Assert.assertNotNull(emptyUri);
        Assert.assertEquals(URI.create(""), emptyUri);

        URI whitespaceUri = mapper.readValue("\"   \"", URI.class);
        Assert.assertNotNull(whitespaceUri);
        Assert.assertEquals(URI.create(""), whitespaceUri);
    }

    @Test
    public void testDeserialize_class() throws Exception {
        Class<?> clazz = mapper.readValue("\"java.lang.String\"", Class.class);
        Assert.assertEquals(String.class, clazz);

        Class<?> emptyClass = mapper.readValue("\"\"", Class.class);
        Assert.assertNull(emptyClass);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_class_unknownClass() throws Exception {
        mapper.readValue("\"com.nonexistent.NoSuchClassExist\"", Class.class);
    }

    @Test
    public void testDeserialize_javaType() throws Exception {
        JavaType javaType = mapper.readValue("\"java.util.List<java.lang.String>\"", JavaType.class);
        Assert.assertNotNull(javaType);
        Assert.assertTrue(javaType.isContainerType());

        JavaType emptyType = mapper.readValue("\"\"", JavaType.class);
        Assert.assertNull(emptyType);
    }

    @Test
    public void testDeserialize_currency() throws Exception {
        Currency currency = mapper.readValue("\"USD\"", Currency.class);
        Assert.assertNotNull(currency);
        Assert.assertEquals("USD", currency.getCurrencyCode());

        Currency emptyCurrency = mapper.readValue("\"\"", Currency.class);
        Assert.assertNull(emptyCurrency);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_currency_invalid() throws Exception {
        mapper.readValue("\"INVALID_CURRENCY\"", Currency.class);
    }

    @Test
    public void testDeserialize_pattern() throws Exception {
        Pattern pattern = mapper.readValue("\"a*b\"", Pattern.class);
        Assert.assertNotNull(pattern);
        Assert.assertEquals("a*b", pattern.pattern());

        Pattern emptyPattern = mapper.readValue("\"\"", Pattern.class);
        Assert.assertNull(emptyPattern);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_pattern_invalid() throws Exception {
        mapper.readValue("\"[a-z\"", Pattern.class);
    }

    @Test
    public void testDeserialize_locale() throws Exception {
        Locale single = mapper.readValue("\"en\"", Locale.class);
        Assert.assertEquals(new Locale("en"), single);

        Locale doublePart = mapper.readValue("\"en_US\"", Locale.class);
        Assert.assertEquals(new Locale("en", "US"), doublePart);

        Locale triplePart = mapper.readValue("\"en_US_WIN\"", Locale.class);
        Assert.assertEquals(new Locale("en", "US", "WIN"), triplePart);

        Locale emptyLocale = mapper.readValue("\"\"", Locale.class);
        Assert.assertEquals(Locale.ROOT, emptyLocale);

        Locale whitespaceLocale = mapper.readValue("\"   \"", Locale.class);
        Assert.assertEquals(Locale.ROOT, whitespaceLocale);
    }

    @Test
    public void testDeserialize_charset() throws Exception {
        Charset charset = mapper.readValue("\"UTF-8\"", Charset.class);
        Assert.assertEquals(Charset.forName("UTF-8"), charset);

        Charset emptyCharset = mapper.readValue("\"\"", Charset.class);
        Assert.assertNull(emptyCharset);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_charset_invalid() throws Exception {
        mapper.readValue("\"NOT-A-REAL-CHARSET\"", Charset.class);
    }

    @Test
    public void testDeserialize_timeZone() throws Exception {
        TimeZone tz = mapper.readValue("\"UTC\"", TimeZone.class);
        Assert.assertEquals(TimeZone.getTimeZone("UTC"), tz);

        TimeZone emptyTz = mapper.readValue("\"\"", TimeZone.class);
        Assert.assertNull(emptyTz);
    }

    @Test
    public void testDeserialize_inetAddress() throws Exception {
        InetAddress address = mapper.readValue("\"127.0.0.1\"", InetAddress.class);
        Assert.assertEquals(InetAddress.getByName("127.0.0.1"), address);

        InetAddress emptyAddress = mapper.readValue("\"\"", InetAddress.class);
        Assert.assertNull(emptyAddress);
    }

    @Test
    public void testDeserialize_inetSocketAddress() throws Exception {
        InetSocketAddress bracketedWithPort = mapper.readValue("\"[::1]:8080\"", InetSocketAddress.class);
        Assert.assertEquals(8080, bracketedWithPort.getPort());
        Assert.assertEquals("::1", bracketedWithPort.getHostString());

        InetSocketAddress bracketedWithoutPort = mapper.readValue("\"[::1]\"", InetSocketAddress.class);
        Assert.assertEquals(0, bracketedWithoutPort.getPort());
        Assert.assertEquals("::1", bracketedWithoutPort.getHostString());

        InetSocketAddress hostWithPort = mapper.readValue("\"127.0.0.1:9000\"", InetSocketAddress.class);
        Assert.assertEquals(9000, hostWithPort.getPort());
        Assert.assertEquals("127.0.0.1", hostWithPort.getHostString());

        InetSocketAddress hostWithoutPort = mapper.readValue("\"127.0.0.1\"", InetSocketAddress.class);
        Assert.assertEquals(0, hostWithoutPort.getPort());
        Assert.assertEquals("127.0.0.1", hostWithoutPort.getHostString());

        InetSocketAddress unbracketedIpv6 = mapper.readValue("\"2001:db8::1\"", InetSocketAddress.class);
        Assert.assertEquals(0, unbracketedIpv6.getPort());
        Assert.assertEquals("2001:db8::1", unbracketedIpv6.getHostString());

        InetSocketAddress emptySocketAddress = mapper.readValue("\"\"", InetSocketAddress.class);
        Assert.assertNull(emptySocketAddress);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_inetSocketAddress_malformedBracketed() throws Exception {
        mapper.readValue("\"[::1:8080\"", InetSocketAddress.class);
    }

    @Test
    public void testDeserialize_unwrapSingleValueArray_success() throws Exception {
        ObjectReader reader = mapper.readerFor(File.class)
                .with(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        File result = reader.readValue("[\"/tmp/sample.txt\"]");
        Assert.assertEquals(new File("/tmp/sample.txt"), result);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_unwrapSingleValueArray_multipleElementsThrows() throws Exception {
        ObjectReader reader = mapper.readerFor(File.class)
                .with(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        reader.readValue("[\"/tmp/1.txt\", \"/tmp/2.txt\"]");
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_notArrayNotStringNotEmbeddedObject_throwsMappingException() throws Exception {
        mapper.readValue("12345", File.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStd_unknownKind_throwsIllegalArgumentException() throws IOException {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(Object.class, 999);
        std._deserialize("someValue", mapper.getDeserializationContext());
    }

    private static class CustomFromStringDeserializer extends FromStringDeserializer<StringBuilder> {
        private final boolean returnNull;
        private final boolean throwIaeWithMessage;
        private final boolean throwIaeWithoutMessage;

        public CustomFromStringDeserializer(boolean returnNull, boolean throwIaeWithMessage, boolean throwIaeWithoutMessage) {
            super(StringBuilder.class);
            this.returnNull = returnNull;
            this.throwIaeWithMessage = throwIaeWithMessage;
            this.throwIaeWithoutMessage = throwIaeWithoutMessage;
        }

        @Override
        protected StringBuilder _deserialize(String value, DeserializationContext ctxt) throws IOException {
            if (throwIaeWithMessage) {
                throw new IllegalArgumentException("Custom IAE message");
            }
            if (throwIaeWithoutMessage) {
                throw new IllegalArgumentException();
            }
            if (returnNull) {
                return null;
            }
            return new StringBuilder(value);
        }
    }

    @Test
    public void testDeserialize_customSuccessful() throws Exception {
        ObjectMapper customMapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(StringBuilder.class, new CustomFromStringDeserializer(false, false, false));
        customMapper.registerModule(module);

        StringBuilder sb = customMapper.readValue("\"testValue\"", StringBuilder.class);
        Assert.assertNotNull(sb);
        Assert.assertEquals("testValue", sb.toString());
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_customReturnsNull_throwsWeirdStringException() throws Exception {
        ObjectMapper customMapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(StringBuilder.class, new CustomFromStringDeserializer(true, false, false));
        customMapper.registerModule(module);

        customMapper.readValue("\"testValue\"", StringBuilder.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_customThrowsIaeWithMessage_throwsJsonMappingException() throws Exception {
        ObjectMapper customMapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(StringBuilder.class, new CustomFromStringDeserializer(false, true, false));
        customMapper.registerModule(module);

        customMapper.readValue("\"testValue\"", StringBuilder.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_customThrowsIaeWithoutMessage_throwsJsonMappingException() throws Exception {
        ObjectMapper customMapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(StringBuilder.class, new CustomFromStringDeserializer(false, false, true));
        customMapper.registerModule(module);

        customMapper.readValue("\"testValue\"", StringBuilder.class);
    }

    private static class EmbeddedTestDeserializer extends FromStringDeserializer<Object> {
        public EmbeddedTestDeserializer() {
            super(Object.class);
        }

        @Override
        protected Object _deserialize(String value, DeserializationContext ctxt) {
            return value;
        }

        public Object invokeDeserializeEmbedded(Object ob, DeserializationContext ctxt) throws IOException {
            return _deserializeEmbedded(ob, ctxt);
        }
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeEmbedded_defaultImplThrows() throws IOException {
        EmbeddedTestDeserializer deser = new EmbeddedTestDeserializer();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        deser.invokeDeserializeEmbedded(12345, ctxt);
    }

    @Test
    public void testDeserialize_embeddedObjectSameType() throws Exception {
        FromStringDeserializer<Object> deser = new FromStringDeserializer<Object>(byte[].class) {
            @Override
            protected Object _deserialize(String value, DeserializationContext ctxt) {
                return value;
            }
        };

        byte[] payload = new byte[]{1, 2, 3};
        BinaryNode node = BinaryNode.valueOf(payload);
        JsonParser p = node.traverse();
        p.nextToken(); // position at VALUE_EMBEDDED_OBJECT

        Object result = deser.deserialize(p, mapper.getDeserializationContext());
        Assert.assertArrayEquals(payload, (byte[]) result);
    }

    @Test
    public void testDeserialize_embeddedObjectNull() throws Exception {
        FromStringDeserializer<Object> deser = new FromStringDeserializer<Object>(String.class) {
            @Override
            protected Object _deserialize(String value, DeserializationContext ctxt) {
                return value;
            }
        };

        JsonParser p = new JsonParserSequence(new JsonParser[0]) {
            @Override
            public JsonToken getCurrentToken() {
                return JsonToken.VALUE_EMBEDDED_OBJECT;
            }

            @Override
            public String getValueAsString() {
                return null;
            }

            @Override
            public Object getEmbeddedObject() {
                return null;
            }
        };

        Object result = deser.deserialize(p, mapper.getDeserializationContext());
        Assert.assertNull(result);
    }
}
