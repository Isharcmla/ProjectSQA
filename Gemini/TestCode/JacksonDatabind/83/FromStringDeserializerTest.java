package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

public class FromStringDeserializerTest {

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    public void testTypes_notNullAndContainsExpectedTypes() {
        Class<?>[] types = FromStringDeserializer.types();
        Assert.assertNotNull(types);
        Assert.assertEquals(13, types.length);
        Assert.assertEquals(File.class, types[0]);
        Assert.assertEquals(StringBuilder.class, types[12]);
    }

    @Test
    public void testFindDeserializer_supportedTypes_returnsNonNull() {
        Class<?>[] supported = FromStringDeserializer.types();
        for (Class<?> cls : supported) {
            FromStringDeserializer.Std deser = FromStringDeserializer.findDeserializer(cls);
            Assert.assertNotNull("Deserializer for " + cls.getName() + " should not be null", deser);
            Assert.assertEquals(cls, deser.handledType());
        }
    }

    @Test
    public void testFindDeserializer_unsupportedType_returnsNull() {
        Assert.assertNull(FromStringDeserializer.findDeserializer(Object.class));
        Assert.assertNull(FromStringDeserializer.findDeserializer(String.class));
        Assert.assertNull(FromStringDeserializer.findDeserializer(Integer.class));
    }

    @Test
    public void testDeserialize_file_success() throws Exception {
        File file = mapper.readValue("\"/tmp/test.txt\"", File.class);
        Assert.assertNotNull(file);
        Assert.assertEquals(new File("/tmp/test.txt"), file);
    }

    @Test
    public void testDeserialize_url_success() throws Exception {
        URL url = mapper.readValue("\"http://localhost:8080/test\"", URL.class);
        Assert.assertNotNull(url);
        Assert.assertEquals("http://localhost:8080/test", url.toString());
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_url_malformed_throwsException() throws Exception {
        mapper.readValue("\"malformed_url_without_protocol\"", URL.class);
    }

    @Test
    public void testDeserialize_uri_success() throws Exception {
        URI uri = mapper.readValue("\"urn:isbn:0451450523\"", URI.class);
        Assert.assertNotNull(uri);
        Assert.assertEquals("urn:isbn:0451450523", uri.toString());
    }

    @Test
    public void testDeserialize_uri_emptyString_returnsEmptyURI() throws Exception {
        URI uri = mapper.readValue("\"\"", URI.class);
        Assert.assertNotNull(uri);
        Assert.assertEquals(URI.create(""), uri);

        URI uriWhitespace = mapper.readValue("\"   \"", URI.class);
        Assert.assertNotNull(uriWhitespace);
        Assert.assertEquals(URI.create(""), uriWhitespace);
    }

    @Test
    public void testDeserialize_class_success() throws Exception {
        Class<?> cls = mapper.readValue("\"java.lang.String\"", Class.class);
        Assert.assertEquals(String.class, cls);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_class_notFound_throwsException() throws Exception {
        mapper.readValue("\"com.nonexistent.NoSuchClass123\"", Class.class);
    }

    @Test
    public void testDeserialize_javaType_success() throws Exception {
        JavaType javaType = mapper.readValue("\"java.util.List<java.lang.String>\"", JavaType.class);
        Assert.assertNotNull(javaType);
        Assert.assertEquals(java.util.List.class, javaType.getRawClass());
        Assert.assertEquals(String.class, javaType.getContentType().getRawClass());
    }

    @Test
    public void testDeserialize_currency_success() throws Exception {
        Currency currency = mapper.readValue("\"USD\"", Currency.class);
        Assert.assertNotNull(currency);
        Assert.assertEquals("USD", currency.getCurrencyCode());
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_currency_invalid_throwsException() throws Exception {
        mapper.readValue("\"INVALID_CURRENCY\"", Currency.class);
    }

    @Test
    public void testDeserialize_pattern_success() throws Exception {
        Pattern pattern = mapper.readValue("\"[a-z]+\"", Pattern.class);
        Assert.assertNotNull(pattern);
        Assert.assertTrue(pattern.matcher("abc").matches());
        Assert.assertFalse(pattern.matcher("123").matches());
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_pattern_invalid_throwsException() throws Exception {
        mapper.readValue("\"(?[\"", Pattern.class);
    }

    @Test
    public void testDeserialize_locale_singleSegment() throws Exception {
        Locale loc = mapper.readValue("\"en\"", Locale.class);
        Assert.assertEquals(new Locale("en"), loc);
    }

    @Test
    public void testDeserialize_locale_twoSegmentsHyphen() throws Exception {
        Locale loc = mapper.readValue("\"en-US\"", Locale.class);
        Assert.assertEquals(new Locale("en", "US"), loc);
    }

    @Test
    public void testDeserialize_locale_twoSegmentsUnderscore() throws Exception {
        Locale loc = mapper.readValue("\"en_US\"", Locale.class);
        Assert.assertEquals(new Locale("en", "US"), loc);
    }

    @Test
    public void testDeserialize_locale_threeSegments() throws Exception {
        Locale loc = mapper.readValue("\"en_US_WIN\"", Locale.class);
        Assert.assertEquals(new Locale("en", "US", "WIN"), loc);

        Locale locHyphen = mapper.readValue("\"en-US-WIN\"", Locale.class);
        Assert.assertEquals(new Locale("en", "US", "WIN"), locHyphen);
    }

    @Test
    public void testDeserialize_locale_emptyString_returnsRoot() throws Exception {
        Locale loc = mapper.readValue("\"\"", Locale.class);
        Assert.assertEquals(Locale.ROOT, loc);

        Locale locSpaces = mapper.readValue("\"   \"", Locale.class);
        Assert.assertEquals(Locale.ROOT, locSpaces);
    }

    @Test
    public void testDeserialize_charset_success() throws Exception {
        Charset charset = mapper.readValue("\"UTF-8\"", Charset.class);
        Assert.assertEquals(StandardCharsets.UTF_8, charset);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_charset_invalid_throwsException() throws Exception {
        mapper.readValue("\"INVALID_CHARSET_NAME\"", Charset.class);
    }

    @Test
    public void testDeserialize_timeZone_success() throws Exception {
        TimeZone tz = mapper.readValue("\"GMT+1\"", TimeZone.class);
        Assert.assertNotNull(tz);
        Assert.assertEquals("GMT+01:00", tz.getID());
    }

    @Test
    public void testDeserialize_inetAddress_success() throws Exception {
        InetAddress address = mapper.readValue("\"127.0.0.1\"", InetAddress.class);
        Assert.assertNotNull(address);
        Assert.assertEquals("127.0.0.1", address.getHostAddress());
    }

    @Test
    public void testDeserialize_inetSocketAddress_bracketedIpv6WithPort() throws Exception {
        InetSocketAddress addr = mapper.readValue("\"[::1]:8080\"", InetSocketAddress.class);
        Assert.assertNotNull(addr);
        Assert.assertEquals(8080, addr.getPort());
        Assert.assertEquals("[::1]", addr.getHostString());
    }

    @Test
    public void testDeserialize_inetSocketAddress_bracketedIpv6WithoutPort() throws Exception {
        InetSocketAddress addr = mapper.readValue("\"[::1]\"", InetSocketAddress.class);
        Assert.assertNotNull(addr);
        Assert.assertEquals(0, addr.getPort());
        Assert.assertEquals("[::1]", addr.getHostString());
    }

    @Test
    public void testDeserialize_inetSocketAddress_bracketedIpv6MissingClosingBracket_throwsException() throws Exception {
        try {
            mapper.readValue("\"[::1:8080\"", InetSocketAddress.class);
            Assert.fail("Expected InvalidFormatException");
        } catch (InvalidFormatException e) {
            Assert.assertTrue(e.getMessage().contains("Bracketed IPv6 address must contain closing bracket"));
        }
    }

    @Test
    public void testDeserialize_inetSocketAddress_hostAndPort() throws Exception {
        InetSocketAddress addr = mapper.readValue("\"localhost:9000\"", InetSocketAddress.class);
        Assert.assertNotNull(addr);
        Assert.assertEquals(9000, addr.getPort());
        Assert.assertEquals("localhost", addr.getHostString());
    }

    @Test
    public void testDeserialize_inetSocketAddress_hostOnly() throws Exception {
        InetSocketAddress addr = mapper.readValue("\"localhost\"", InetSocketAddress.class);
        Assert.assertNotNull(addr);
        Assert.assertEquals(0, addr.getPort());
        Assert.assertEquals("localhost", addr.getHostString());
    }

    @Test
    public void testDeserialize_stringBuilder_success() throws Exception {
        StringBuilder sb = mapper.readValue("\"Hello World\"", StringBuilder.class);
        Assert.assertNotNull(sb);
        Assert.assertEquals("Hello World", sb.toString());
    }

    @Test
    public void testDeserialize_stringBuilder_emptyString() throws Exception {
        StringBuilder sb = mapper.readValue("\"\"", StringBuilder.class);
        Assert.assertNotNull(sb);
        Assert.assertEquals("", sb.toString());

        StringBuilder sbSpaces = mapper.readValue("\"   \"", StringBuilder.class);
        Assert.assertNotNull(sbSpaces);
        Assert.assertEquals("", sbSpaces.toString());
    }

    @Test
    public void testDeserialize_emptyString_nullDefault() throws Exception {
        File file = mapper.readValue("\"\"", File.class);
        Assert.assertNull(file);

        Currency currency = mapper.readValue("\"   \"", Currency.class);
        Assert.assertNull(currency);
    }

    @Test
    public void testDeserialize_unwrapSingleValueArray_success() throws Exception {
        ObjectMapper unwrapMapper = new ObjectMapper();
        unwrapMapper.enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        Charset charset = unwrapMapper.readValue("[\"UTF-8\"]", Charset.class);
        Assert.assertEquals(StandardCharsets.UTF_8, charset);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_arrayNotUnwrapped_throwsException() throws Exception {
        mapper.readValue("[\"UTF-8\"]", Charset.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_unexpectedTokenObject_throwsException() throws Exception {
        mapper.readValue("{\"key\":\"value\"}", File.class);
    }

    @Test
    public void testDeserialize_embeddedObject_null() throws Exception {
        FromStringDeserializer.Std deser = FromStringDeserializer.findDeserializer(File.class);
        TokenBuffer buffer = new TokenBuffer(mapper, false);
        buffer.writeNull();
        JsonParser p = buffer.asParser();
        p.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        Object result = deser.deserialize(p, ctxt);
        Assert.assertNull(result);
    }

    @Test
    public void testDeserialize_embeddedObject_sameType() throws Exception {
        FromStringDeserializer.Std deser = FromStringDeserializer.findDeserializer(File.class);
        File expectedFile = new File("/test/embedded");

        TokenBuffer buffer = new TokenBuffer(mapper, false);
        buffer.writeEmbeddedObject(expectedFile);
        JsonParser p = buffer.asParser();
        p.nextToken();
        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, p.getCurrentToken());

        DeserializationContext ctxt = mapper.getDeserializationContext();
        Object result = deser.deserialize(p, ctxt);
        Assert.assertSame(expectedFile, result);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_embeddedObject_incompatibleType_throwsException() throws Exception {
        FromStringDeserializer.Std deser = FromStringDeserializer.findDeserializer(File.class);

        TokenBuffer buffer = new TokenBuffer(mapper, false);
        buffer.writeEmbeddedObject(Integer.valueOf(12345));
        JsonParser p = buffer.asParser();
        p.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        deser.deserialize(p, ctxt);
    }

    @Test(expected = RuntimeException.class)
    public void testStd_invalidKind_throwsInternalError() throws Exception {
        FromStringDeserializer.Std invalidStd = new FromStringDeserializer.Std(Object.class, 9999);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        invalidStd._deserialize("test", ctxt);
    }

    @Test
    public void testCustomFromStringDeserializer_returnsNullHandling() throws Exception {
        FromStringDeserializer<String> customDeser = new FromStringDeserializer<String>(String.class) {
            private static final long serialVersionUID = 1L;

            @Override
            protected String _deserialize(String value, DeserializationContext ctxt) {
                return null;
            }
        };

        TokenBuffer buffer = new TokenBuffer(mapper, false);
        buffer.writeString("someValue");
        JsonParser p = buffer.asParser();
        p.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        try {
            customDeser.deserialize(p, ctxt);
            Assert.fail("Expected JsonMappingException when _deserialize returns null");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("not a valid textual representation"));
        }
    }
}
