import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TypeParserTest {

    private TypeFactory factory;
    private TypeParser parser;

    @Before
    public void setUp() {
        factory = TypeFactory.defaultInstance();
        parser = new TypeParser(factory);
    }

    // ---------- Normal / typical input ----------

    @Test
    public void testParse_simpleClass_returnsCorrectType() {
        JavaType type = parser.parse("java.lang.String");
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testParse_genericListType_returnsCorrectType() {
        JavaType type = parser.parse("java.util.List<java.lang.String>");
        assertNotNull(type);
        assertEquals(java.util.List.class, type.getRawClass());
        assertTrue(type.isContainerType());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testParse_genericMapType_returnsCorrectType() {
        JavaType type = parser.parse("java.util.Map<java.lang.String,java.lang.Integer>");
        assertNotNull(type);
        assertEquals(java.util.Map.class, type.getRawClass());
        assertEquals(String.class, type.getKeyType().getRawClass());
        assertEquals(Integer.class, type.getContentType().getRawClass());
    }

    @Test
    public void testParse_nestedGenericType_returnsCorrectType() {
        JavaType type = parser.parse("java.util.List<java.util.List<java.lang.String>>");
        assertNotNull(type);
        assertEquals(java.util.List.class, type.getRawClass());
        JavaType inner = type.getContentType();
        assertEquals(java.util.List.class, inner.getRawClass());
        assertEquals(String.class, inner.getContentType().getRawClass());
    }

    @Test
    public void testParse_typeWithWhitespace_isTrimmedCorrectly() {
        JavaType type = parser.parse("  java.lang.String  ");
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    // ---------- Edge cases ----------

    @Test(expected = NullPointerException.class)
    public void testParse_nullInput_throwsNullPointerException() {
        parser.parse(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_emptyString_throwsIllegalArgumentException() {
        parser.parse("");
    }

    @Test
    public void testWithFactory_sameFactory_returnsSameInstance() {
        TypeParser result = parser.withFactory(factory);
        assertSame(parser, result);
    }

    @Test
    public void testWithFactory_differentFactory_returnsNewInstance() {
        TypeFactory otherFactory = TypeFactory.defaultInstance().withModifier(null);
        TypeParser result = parser.withFactory(otherFactory);
        assertNotSame(parser, result);
        assertNotNull(result);
    }

    @Test
    public void testParse_primitiveIntArray_returnsCorrectType() {
        JavaType type = parser.parse("int[]");
        assertNotNull(type);
        assertTrue(type.isArrayType());
    }

    // ---------- Exception cases ----------

    @Test(expected = IllegalArgumentException.class)
    public void testParse_unknownClass_throwsIllegalArgumentException() {
        parser.parse("com.nonexistent.NoSuchClassXYZ");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_unexpectedTokensAfterCompleteType_throwsIllegalArgumentException() {
        parser.parse("java.lang.String extra");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_unclosedGenericBracket_throwsIllegalArgumentException() {
        parser.parse("java.util.List<java.lang.String");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_missingCommaOrClosingBracket_throwsIllegalArgumentException() {
        parser.parse("java.util.Map<java.lang.String java.lang.Integer>");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_endOfStringInsideGenerics_throwsIllegalArgumentException() {
        parser.parse("java.util.List<");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_onlyOpeningBracket_throwsIllegalArgumentException() {
        parser.parse("<");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_trailingCommaWithoutClosing_throwsIllegalArgumentException() {
        parser.parse("java.util.Map<java.lang.String,>");
    }
}
