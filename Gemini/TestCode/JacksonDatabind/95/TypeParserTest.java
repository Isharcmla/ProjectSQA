package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class TypeParserTest {

    private TypeFactory _typeFactory;
    private TypeParser _parser;

    @Before
    public void setUp() {
        _typeFactory = TypeFactory.defaultInstance();
        _parser = new TypeParser(_typeFactory);
    }

    @Test
    public void testWithFactory_sameFactory_returnsSameInstance() {
        TypeParser sameParser = _parser.withFactory(_typeFactory);
        Assert.assertSame(_parser, sameParser);
    }

    @Test
    public void testWithFactory_differentFactory_returnsNewInstance() {
        TypeFactory newFactory = TypeFactory.defaultInstance().withModifier(null);
        TypeParser newParser = _parser.withFactory(newFactory);
        Assert.assertNotSame(_parser, newParser);
        Assert.assertNotNull(newParser);
    }

    @Test
    public void testParse_simpleClass_success() {
        JavaType type = _parser.parse("java.lang.String");
        Assert.assertNotNull(type);
        Assert.assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testParse_primitiveType_success() {
        JavaType type = _parser.parse("int");
        Assert.assertNotNull(type);
        Assert.assertEquals(int.class, type.getRawClass());
    }

    @Test
    public void testParse_singleGeneric_success() {
        JavaType type = _parser.parse("java.util.List<java.lang.String>");
        Assert.assertNotNull(type);
        Assert.assertEquals(List.class, type.getRawClass());
        Assert.assertEquals(1, type.containedTypeCount());
        Assert.assertEquals(String.class, type.containedType(0).getRawClass());
    }

    @Test
    public void testParse_multiGeneric_success() {
        JavaType type = _parser.parse("java.util.Map<java.lang.String,java.lang.Integer>");
        Assert.assertNotNull(type);
        Assert.assertEquals(Map.class, type.getRawClass());
        Assert.assertEquals(2, type.containedTypeCount());
        Assert.assertEquals(String.class, type.containedType(0).getRawClass());
        Assert.assertEquals(Integer.class, type.containedType(1).getRawClass());
    }

    @Test
    public void testParse_nestedGenerics_success() {
        JavaType type = _parser.parse("java.util.Map<java.lang.String,java.util.List<java.lang.Integer>>");
        Assert.assertNotNull(type);
        Assert.assertEquals(Map.class, type.getRawClass());
        Assert.assertEquals(2, type.containedTypeCount());
        Assert.assertEquals(String.class, type.containedType(0).getRawClass());

        JavaType valType = type.containedType(1);
        Assert.assertEquals(List.class, valType.getRawClass());
        Assert.assertEquals(1, valType.containedTypeCount());
        Assert.assertEquals(Integer.class, valType.containedType(0).getRawClass());
    }

    @Test
    public void testParse_withWhitespace_success() {
        JavaType type = _parser.parse("  java.util.Map < java.lang.String , java.lang.Integer >  ");
        Assert.assertNotNull(type);
        Assert.assertEquals(Map.class, type.getRawClass());
        Assert.assertEquals(String.class, type.containedType(0).getRawClass());
        Assert.assertEquals(Integer.class, type.containedType(1).getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_emptyString_throwsIllegalArgumentException() {
        _parser.parse("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_whitespaceOnly_throwsIllegalArgumentException() {
        _parser.parse("   ");
    }

    @Test
    public void testParse_unexpectedTokensAfterCompleteType_throwsIllegalArgumentException() {
        try {
            _parser.parse("java.lang.String extraToken");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Unexpected tokens after complete type"));
        }
    }

    @Test
    public void testParse_unclosedGenerics_throwsIllegalArgumentException() {
        try {
            _parser.parse("java.util.List<java.lang.String");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Unexpected end-of-string"));
        }
    }

    @Test
    public void testParse_unexpectedTokenInGenerics_throwsIllegalArgumentException() {
        try {
            _parser.parse("java.util.Map<java.lang.String<java.lang.Integer>");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("expected ',' or '>'"));
        }
    }

    @Test
    public void testParse_emptyGenerics_throwsIllegalArgumentException() {
        try {
            _parser.parse("java.util.List<>");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Failed to parse type"));
        }
    }

    @Test
    public void testParse_trailingCommaInsideGenerics_throwsIllegalArgumentException() {
        try {
            _parser.parse("java.util.List<java.lang.String,>");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Failed to parse type"));
        }
    }

    @Test
    public void testParse_unknownClassName_throwsIllegalArgumentException() {
        try {
            _parser.parse("com.nonexistent.package.NonExistentClass");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Can not locate class"));
        }
    }
}
