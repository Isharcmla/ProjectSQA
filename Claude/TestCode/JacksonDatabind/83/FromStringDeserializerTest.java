import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JavaType;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

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

public class FromStringDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // ---------- types() ----------

    @Test
    public void testTypes_returnsExpectedArray() {
        Class<?>[] types = FromStringDeserializer.types();
        assertNotNull(types);
        assertEquals(13, types.length);
        assertTrue(contains(types, File.class));
        assertTrue(contains(types, URL.class));
        assertTrue(contains(types, URI.class));
        assertTrue(contains(types, Class.class));
        assertTrue(contains(types, JavaType.class));
        assertTrue(contains(types, Currency.class));
        assertTrue(contains(types, Pattern.class));
        assertTrue(contains(types, Locale.class));
        assertTrue(contains(types, Charset.class));
        assertTrue(contains(types, TimeZone.class));
        assertTrue(contains(types, InetAddress.class));
        assertTrue(contains(types, InetSocketAddress.class));
        assertTrue(contains(types, StringBuilder.class));
    }

    private boolean contains(Class<?>[] arr, Class<?> target) {
        for (Class<?> c : arr) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }

    // ---------- findDeserializer() ----------

    @Test
    public void testFindDeserializer_fileType_returnsStdWithFileKind() {
        Std d = FromStringDeserializer.findDeserializer(File.class);
        assertNotNull(d);
        assertEquals(Std.STD_FILE, d._kind);
    }

    @Test
    public void testFindDeserializer_urlType_returnsStdWithUrlKind() {
        Std d = FromStringDeserializer.findDeserializer(URL.class);
        assertNotNull(d);
        assertEquals(Std.STD_URL, d._kind);
    }

    @Test
    public void testFindDeserializer_uriType_returnsStdWithUriKind() {
        Std d = FromStringDeserializer.findDeserializer(URI.class);
        assertNotNull(d);
        assertEquals(Std.STD_URI, d._kind);
    }

    @Test
    public void testFindDeserializer_classType_returnsStdWithClassKind() {
        Std d = FromStringDeserializer.findDeserializer(Class.class);
        assertNotNull(d);
        assertEquals(Std.STD_CLASS, d._kind);
    }

    @Test
    public void testFindDeserializer_javaTypeType_returnsStdWithJavaTypeKind() {
        Std d = FromStringDeserializer.findDeserializer(JavaType.class);
        assertNotNull(d);
        assertEquals(Std.STD_JAVA_TYPE, d._kind);
    }

    @Test
    public void testFindDeserializer_currencyType_returnsStdWithCurrencyKind() {
        Std d = FromStringDeserializer.findDeserializer(Currency.class);
        assertNotNull(d);
        assertEquals(Std.STD_CURRENCY, d._kind);
    }

    @Test
    public void testFindDeserializer_patternType_returnsStdWithPatternKind() {
        Std d = FromStringDeserializer.findDeserializer(Pattern.class);
        assertNotNull(d);
        assertEquals(Std.STD_PATTERN, d._kind);
    }

    @Test
    public void testFindDeserializer_localeType_returnsStdWithLocaleKind() {
        Std d = FromStringDeserializer.findDeserializer(Locale.class);
        assertNotNull(d);
        assertEquals(Std.STD_LOCALE, d._kind);
    }

    @Test
    public void testFindDeserializer_charsetType_returnsStdWithCharsetKind() {
        Std d = FromStringDeserializer.findDeserializer(Charset.class);
        assertNotNull(d);
        assertEquals(Std.STD_CHARSET, d._kind);
    }

    @Test
    public void testFindDeserializer_timeZoneType_returnsStdWithTimeZoneKind() {
        Std d = FromStringDeserializer.findDeserializer(TimeZone.class);
        assertNotNull(d);
        assertEquals(Std.STD_TIME_ZONE, d._kind);
    }

    @Test
    public void testFindDeserializer_inetAddressType_returnsStdWithInetAddressKind() {
        Std d = FromStringDeserializer.findDeserializer(InetAddress.class);
        assertNotNull(d);
        assertEquals(Std.STD_INET_ADDRESS, d._kind);
    }

    @Test
    public void testFindDeserializer_inetSocketAddressType_returnsStdWithInetSocketAddressKind() {
        Std d = FromStringDeserializer.findDeserializer(InetSocketAddress.class);
        assertNotNull(d);
        assertEquals(Std.STD_INET_SOCKET_ADDRESS, d._kind);
    }

    @Test
    public void testFindDeserializer_stringBuilderType_returnsStdWithStringBuilderKind() {
        Std d = FromStringDeserializer.findDeserializer(StringBuilder.class);
        assertNotNull(d);
        assertEquals(Std.STD_STRING_BUILDER, d._kind);
    }

    @Test
    public void testFindDeserializer_unknownType_returnsNull() {
        Std d = FromStringDeserializer.findDeserializer(String.class);
        assertNull(d);
    }

    // ---------- deserialize() - normal cases via ObjectMapper ----------

    @Test
    public void testDeserialize_file_normalInput_returnsFile() throws IOException {
        File f = mapper.readValue("\"/tmp/test-file\"", File.class);
        assertNotNull(f);
        assertEquals("/tmp/test-file", f.getPath());
    }

    @Test
    public void testDeserialize_url_normalInput_returnsUrl() throws IOException {
        URL url = mapper.readValue("\"http://example.com\"", URL.class);
        assertNotNull(url);
        assertEquals("http://example.com", url.toString());
    }

    @Test
    public void testDeserialize_uri_normalInput_returnsUri() throws IOException {
        URI uri = mapper.readValue("\"http://example.com/path\"", URI.class);
        assertNotNull(uri);
        assertEquals("http://example.com/path", uri.toString());
    }

    @Test
    public void testDeserialize_classType_normalInput_returnsClass() throws IOException {
        Class<?> c = mapper.readValue("\"java.lang.String\"", Class.class);
        assertEquals(String.class, c);
    }

    @Test
    public void testDeserialize_javaType_normalInput_returnsJavaType() throws IOException {
        JavaType jt = mapper.readValue("\"java.lang.String\"", JavaType.class);
        assertNotNull(jt);
        assertEquals(String.class, jt.getRawClass());
    }

    @Test
    public void testDeserialize_currency_normalInput_returnsCurrency() throws IOException {
        Currency c = mapper.readValue("\"USD\"", Currency.class);
        assertNotNull(c);
        assertEquals("USD", c.getCurrencyCode());
    }

    @Test
    public void testDeserialize_pattern_normalInput_returnsPattern() throws IOException {
        Pattern p = mapper.readValue("\"[a-z]+\"", Pattern.class);
        assertNotNull(p);
        assertEquals("[a-z]+", p.pattern());
    }

    @Test
    public void testDeserialize_locale_singlePart_returnsLocale() throws IOException {
        Locale l = mapper.readValue("\"en\"", Locale.class);
        assertNotNull(l);
        assertEquals("en", l.getLanguage());
    }

    @Test
    public void testDeserialize_locale_twoPartsWithUnderscore_returnsLocale() throws IOException {
        Locale l = mapper.readValue("\"en_US\"", Locale.class);
        assertNotNull(l);
        assertEquals("en", l.getLanguage());
        assertEquals("US", l.getCountry());
    }

    @Test
    public void testDeserialize_locale_twoPartsWithHyphen_returnsLocale() throws IOException {
        Locale l = mapper.readValue("\"en-US\"", Locale.class);
        assertNotNull(l);
        assertEquals("en", l.getLanguage());
        assertEquals("US", l.getCountry());
    }

    @Test
    public void testDeserialize_locale_threeParts_returnsLocale() throws IOException {
        Locale l = mapper.readValue("\"en_US_WIN\"", Locale.class);
        assertNotNull(l);
        assertEquals("en", l.getLanguage());
        assertEquals("US", l.getCountry());
        assertEquals("WIN", l.getVariant());
    }

    @Test
    public void testDeserialize_charset_normalInput_returnsCharset() throws IOException {
        Charset cs = mapper.readValue("\"UTF-8\"", Charset.class);
        assertNotNull(cs);
        assertEquals("UTF-8", cs.name());
    }

    @Test
    public void testDeserialize_timeZone_normalInput_returnsTimeZone() throws IOException {
        TimeZone tz = mapper.readValue("\"GMT\"", TimeZone.class);
        assertNotNull(tz);
        assertEquals("GMT", tz.getID());
    }

    @Test
    public void testDeserialize_inetAddress_normalInput_returnsInetAddress() throws IOException {
        InetAddress addr = mapper.readValue("\"127.0.0.1\"", InetAddress.class);
        assertNotNull(addr);
        assertEquals("127.0.0.1", addr.getHostAddress());
    }

    @Test
    public void testDeserialize_inetSocketAddress_hostPort_returnsAddress() throws IOException {
        InetSocketAddress addr = mapper.readValue("\"localhost:8080\"", InetSocketAddress.class);
        assertNotNull(addr);
        assertEquals(8080, addr.getPort());
    }

    @Test
    public void testDeserialize_inetSocketAddress_bracketedIpv6WithPort_returnsAddress() throws IOException {
        InetSocketAddress addr = mapper.readValue("\"[::1]:8080\"", InetSocketAddress.class);
        assertNotNull(addr);
        assertEquals(8080, addr.getPort());
    }

    @Test
    public void testDeserialize_inetSocketAddress_bracketedIpv6WithoutPort_returnsAddressWithZeroPort() throws IOException {
        InetSocketAddress addr = mapper.readValue("\"[::1]\"", InetSocketAddress.class);
        assertNotNull(addr);
        assertEquals(0, addr.getPort());
    }

    @Test
    public void testDeserialize_inetSocketAddress_hostOnly_returnsAddressWithZeroPort() throws IOException {
        InetSocketAddress addr = mapper.readValue("\"localhost\"", InetSocketAddress.class);
        assertNotNull(addr);
        assertEquals(0, addr.getPort());
    }

    @Test
    public void testDeserialize_inetSocketAddress_unbracketedIpv6_returnsAddressWithZeroPort() throws IOException {
        InetSocketAddress addr = mapper.readValue("\"::1\"", InetSocketAddress.class);
        assertNotNull(addr);
        assertEquals(0, addr.getPort());
    }

    @Test
    public void testDeserialize_stringBuilder_normalInput_returnsStringBuilder() throws IOException {
        StringBuilder sb = mapper.readValue("\"hello\"", StringBuilder.class);
        assertNotNull(sb);
        assertEquals("hello", sb.toString());
    }

    // ---------- edge cases: empty / blank strings ----------

    @Test
    public void testDeserialize_file_emptyString_returnsNull() throws IOException {
        File f = mapper.readValue("\"\"", File.class);
        assertNull(f);
    }

    @Test
    public void testDeserialize_file_blankString_returnsNull() throws IOException {
        File f = mapper.readValue("\"   \"", File.class);
        assertNull(f);
    }

    @Test
    public void testDeserialize_uri_emptyString_returnsEmptyUri() throws IOException {
        URI uri = mapper.readValue("\"\"", URI.class);
        assertNotNull(uri);
        assertEquals("", uri.toString());
    }

    @Test
    public void testDeserialize_locale_emptyString_returnsLocaleRoot() throws IOException {
        Locale l = mapper.readValue("\"\"", Locale.class);
        assertEquals(Locale.ROOT, l);
    }

    @Test
    public void testDeserialize_stringBuilder_emptyString_returnsEmptyStringBuilder() throws IOException {
        StringBuilder sb = mapper.readValue("\"\"", StringBuilder.class);
        assertNotNull(sb);
        assertEquals(0, sb.length());
    }

    @Test
    public void testDeserialize_currency_emptyString_returnsNull() throws IOException {
        Currency c = mapper.readValue("\"\"", Currency.class);
        assertNull(c);
    }

    // ---------- exception cases ----------

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_url_invalidInput_throwsException() throws IOException {
        mapper.readValue("\"not a url at all\"", URL.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_currency_invalidInput_throwsException() throws IOException {
        mapper.readValue("\"NOT_A_REAL_CURRENCY_CODE\"", Currency.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_pattern_invalidInput_throwsException() throws IOException {
        mapper.readValue("\"[unclosed\"", Pattern.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_classType_invalidInput_throwsException() throws IOException {
        mapper.readValue("\"com.this.does.not.exist.FooBarBaz\"", Class.class);
    }

    @Test
    public void testDeserialize_inetSocketAddress_unclosedBracket_throwsInvalidFormatException() {
        try {
            mapper.readValue("\"[::1\"", InetSocketAddress.class);
            fail("Expected an exception to be thrown for malformed bracketed IPv6 address");
        } catch (InvalidFormatException expected) {
            // expected: no closing bracket
        } catch (IOException other) {
            // some Jackson versions may wrap differently; still acceptable as failure indicator
            assertTrue(other instanceof JsonMappingException);
        }
    }

    @Test
    public void testDeserialize_array_toScalarType_throwsMismatchedInputOrJsonMappingException() {
        try {
            mapper.readValue("[\"http://example.com\"]", URI.class);
            fail("Expected an exception when array passed to scalar deserializer without unwrap feature");
        } catch (IOException e) {
            assertTrue(e instanceof JsonMappingException);
        }
    }

    @Test
    public void testDeserialize_booleanTokenAsUnexpectedType_throwsException() {
        try {
            mapper.readValue("true", URI.class);
            fail("Expected exception for boolean token given to URI deserializer");
        } catch (IOException e) {
            assertTrue(e instanceof JsonMappingException);
        }
    }
}
