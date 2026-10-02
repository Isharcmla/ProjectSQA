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

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.TokenBuffer;

public class FromStringDeserializerTest {

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    public void testTypes_returnsAllSupportedTypes() {
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
    public void testFindDeserializer_supportedTypes_returnsStdInstance() {
        for (Class<?> type : FromStringDeserializer.types()) {
            FromStringDeserializer.Std deser = FromStringDeserializer.findDeserializer(type);
            Assert.assertNotNull("Expected deserializer for " + type.getName(), deser);
            Assert.assertEquals(type, deser.getValueClass());
        }
    }

    @Test
    public void testFindDeserializer_unsupportedType_returnsNull() {
        Assert.assertNull(FromStringDeserializer.findDeserializer(String.class));
        Assert.assertNull(FromStringDeserializer.findDeserializer(Object.class));
        Assert.assertNull(FromStringDeserializer.findDeserializer(Integer.class));
    }

    @Test
    public void testDeserialize_file() throws Exception {
        File file = mapper.readValue("\"/tmp/test.txt\"", File.class);
        Assert.assertNotNull(file);
        Assert.assertEquals(new File("/tmp/test.txt"), file);
    }

    @Test
    public void testDeserialize_url() throws Exception {
        URL url = mapper.readValue("\"http://localhost:8080/path\"", URL.class);
        Assert.assertNotNull(url);
        Assert.assertEquals("http://localhost:8080/path", url.toExternalForm());
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_url_invalid_throwsException() throws Exception {
        mapper.readValue("\"malformed_url_without_protocol\"", URL.class);
    }

    @Test
    public void testDeserialize_uri() throws Exception {
        URI uri = mapper.readValue("\"http://localhost:8080/path\"", URI.class);
        Assert.assertNotNull(uri);
        Assert.assertEquals(URI.create("http://localhost:8080/path"), uri);
    }

    @Test
    public void testDeserialize_uri_emptyString_returnsEmptyURI() throws Exception {
        URI uri = mapper.readValue("\"\"", URI.class);
        Assert.assertNotNull(uri);
        Assert.assertEquals(URI.create(""), uri);
    }

    @Test
    public void testDeserialize_class() throws Exception {
        Class<?> clazz = mapper.readValue("\"java.lang.String\"", Class.class);
        Assert.assertEquals(String.class, clazz);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_class_invalid_throwsException() throws Exception {
        mapper.readValue("\"com.nonexistent.Class12345\"", Class.class);
    }

    @Test
    public void testDeserialize_javaType() throws Exception {
        JavaType javaType = mapper.readValue("\"java.util.List<java.lang.String>\"", JavaType.class);
        Assert.assertNotNull(javaType);
        Assert.assertTrue(javaType.isCollectionLikeType());
    }

    @Test
    public void testDeserialize_currency() throws Exception {
        Currency currency = mapper.readValue("\"USD\"", Currency.class);
        Assert.assertNotNull(currency);
        Assert.assertEquals(Currency.getInstance("USD"), currency);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_currency_invalid_throwsException() throws Exception {
        mapper.readValue("\"INVALID_CURR_CODE\"", Currency.class);
    }

    @Test
    public void testDeserialize_pattern() throws Exception {
        Pattern pattern = mapper.readValue("\"^[a-z]+$\"", Pattern.class);
        Assert.assertNotNull(pattern);
        Assert.assertTrue(pattern.matcher("abc").matches());
        Assert.assertFalse(pattern.matcher("123").matches());
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_pattern_invalid_throwsException() throws Exception {
        mapper.readValue("\"[a-\"", Pattern.class);
    }

    @Test
    public void testDeserialize_locale_singleSegment() throws Exception {
        Locale locale = mapper.readValue("\"en\"", Locale.class);
        Assert.assertEquals(new Locale("en"), locale);
    }

    @Test
    public void testDeserialize_locale_twoSegments() throws Exception {
        Locale locale = mapper.readValue("\"en_US\"", Locale.class);
        Assert.assertEquals(new Locale("en", "US"), locale);
    }

    @Test
    public void testDeserialize_locale_threeSegments() throws Exception {
        Locale locale = mapper.readValue("\"en_US_WIN\"", Locale.class);
        Assert.assertEquals(new Locale("en", "US", "WIN"), locale);
    }

    @Test
    public void testDeserialize_charset() throws Exception {
        Charset charset = mapper.readValue("\"UTF-8\"", Charset.class);
        Assert.assertEquals(Charset.forName("UTF-8"), charset);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_charset_invalid_throwsException() throws Exception {
        mapper.readValue("\"NON_EXISTENT_CHARSET_XYZ\"", Charset.class);
    }

    @Test
    public void testDeserialize_timeZone() throws Exception {
        TimeZone timeZone = mapper.readValue("\"PST\"", TimeZone.class);
        Assert.assertEquals(TimeZone.getTimeZone("PST"), timeZone);
    }

    @Test
    public void testDeserialize_inetAddress() throws Exception {
        InetAddress address = mapper.readValue("\"127.0.0.1\"", InetAddress.class);
        Assert.assertEquals(InetAddress.getByName("127.0.0.1"), address);
    }

    @Test
    public void testDeserialize_inetSocketAddress_bracketedIPv6WithPort() throws Exception {
        InetSocketAddress addr = mapper.readValue("\"[::1]:8080\"", InetSocketAddress.class);
        Assert.assertEquals("[::1]", addr.getHostString());
        Assert.assertEquals(8080, addr.getPort());
    }

    @Test
    public void testDeserialize_inetSocketAddress_bracketedIPv6WithoutPort() throws Exception {
        InetSocketAddress addr = mapper.readValue("\"[::1]\"", InetSocketAddress.class);
        Assert.assertEquals("[::1]", addr.getHostString());
        Assert.assertEquals(0, addr.getPort());
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_inetSocketAddress_bracketedIPv6MissingClosingBracket_throwsException() throws Exception {
        mapper.readValue("\"[::1:8080\"", InetSocketAddress.class);
    }

    @Test
    public void testDeserialize_inetSocketAddress_hostWithPort() throws Exception {
        InetSocketAddress addr = mapper.readValue("\"localhost:8080\"", InetSocketAddress.class);
        Assert.assertEquals("localhost", addr.getHostString());
        Assert.assertEquals(8080, addr.getPort());
    }

    @Test
    public void testDeserialize_inetSocketAddress_hostWithoutPort() throws Exception {
        InetSocketAddress addr = mapper.readValue("\"localhost\"", InetSocketAddress.class);
        Assert.assertEquals("localhost", addr.getHostString());
        Assert.assertEquals(0, addr.getPort());
    }

    @Test
    public void testDeserialize_inetSocketAddress_unbracketedIPv6WithoutPort() throws Exception {
        InetSocketAddress addr = mapper.readValue("\"2001:db8:85a3:8d3:1319:8a2e:370:7348\"", InetSocketAddress.class);
        Assert.assertEquals("2001:db8:85a3:8d3:1319:8a2e:370:7348", addr.getHostString());
        Assert.assertEquals(0, addr.getPort());
    }

    @Test
    public void testDeserialize_emptyAndWhitespaceStrings_returnsNull() throws Exception {
        Assert.assertNull(mapper.readValue("\"\"", File.class));
        Assert.assertNull(mapper.readValue("\"   \"", File.class));
        Assert.assertNull(mapper.readValue("\"\"", Currency.class));
        Assert.assertNull(mapper.readValue("\"   \"", Currency.class));
    }

    @Test
    public void testDeserialize_unwrapSingleValueArray_success() throws Exception {
        ObjectMapper unwrapMapper = new ObjectMapper();
        unwrapMapper.enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);

        Currency currency = unwrapMapper.readValue("[\"USD\"]", Currency.class);
        Assert.assertEquals(Currency.getInstance("USD"), currency);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_unwrapSingleValueArray_multipleValues_throwsException() throws Exception {
        ObjectMapper unwrapMapper = new ObjectMapper();
        unwrapMapper.enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);

        unwrapMapper.readValue("[\"USD\", \"EUR\"]", Currency.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_arrayWithoutFeature_throwsException() throws Exception {
        mapper.readValue("[\"USD\"]", Currency.class);
    }

    @Test
    public void testDeserialize_embeddedObject_null_returnsNull() throws Exception {
        TokenBuffer buffer = new TokenBuffer(mapper, false);
        buffer.writeNull();
        JsonParser parser = buffer.asParser();
        parser.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        FromStringDeserializer.Std deser = FromStringDeserializer.findDeserializer(Currency.class);
        Object result = deser.deserialize(parser, ctxt);
        Assert.assertNull(result);
    }

    @Test
    public void testDeserialize_embeddedObject_sameType_returnsObject() throws Exception {
        Currency expectedCurrency = Currency.getInstance("USD");
        TokenBuffer buffer = new TokenBuffer(mapper, false);
        buffer.writeEmbeddedObject(expectedCurrency);
        JsonParser parser = buffer.asParser();
        parser.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        FromStringDeserializer.Std deser = FromStringDeserializer.findDeserializer(Currency.class);
        Object result = deser.deserialize(parser, ctxt);
        Assert.assertSame(expectedCurrency, result);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_embeddedObject_differentType_throwsException() throws Exception {
        TokenBuffer buffer = new TokenBuffer(mapper, false);
        buffer.writeEmbeddedObject(new Integer(123));
        JsonParser parser = buffer.asParser();
        parser.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        FromStringDeserializer.Std deser = FromStringDeserializer.findDeserializer(Currency.class);
        deser.deserialize(parser, ctxt);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_unexpectedToken_throwsException() throws Exception {
        mapper.readValue("12345", Currency.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_customDeserializer_deserializeReturnsNull_throwsException() throws Exception {
        FromStringDeserializer<Object> deser = new FromStringDeserializer<Object>(String.class) {
            private static final long serialVersionUID = 1L;

            @Override
            protected Object _deserialize(String value, DeserializationContext ctxt) {
                return null;
            }
        };

        TokenBuffer buffer = new TokenBuffer(mapper, false);
        buffer.writeString("someValue");
        JsonParser parser = buffer.asParser();
        parser.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        deser.deserialize(parser, ctxt);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_customDeserializer_throwsIllegalArgumentExceptionWithNullMessage() throws Exception {
        FromStringDeserializer<Object> deser = new FromStringDeserializer<Object>(String.class) {
            private static final long serialVersionUID = 1L;

            @Override
            protected Object _deserialize(String value, DeserializationContext ctxt) {
                throw new IllegalArgumentException((String) null);
            }
        };

        TokenBuffer buffer = new TokenBuffer(mapper, false);
        buffer.writeString("someValue");
        JsonParser parser = buffer.asParser();
        parser.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        deser.deserialize(parser, ctxt);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStd_unknownKind_throwsIllegalArgumentException() throws IOException {
        FromStringDeserializer.Std deser = new FromStringDeserializer.Std(Object.class, 999);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        deser._deserialize("test", ctxt);
    }
}
