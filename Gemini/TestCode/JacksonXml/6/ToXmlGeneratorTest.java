package com.fasterxml.jackson.dataformat.xml.ser;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter;

public class ToXmlGeneratorTest {

    private ToXmlGenerator createGenerator(StringWriter sw) throws Exception {
        return createGenerator(sw, 0, 0);
    }

    private ToXmlGenerator createGenerator(StringWriter sw, int stdFeatures, int xmlFeatures) throws Exception {
        IOContext ctxt = new IOContext(new BufferRecycler(), "test", false);
        XMLOutputFactory xof = XMLOutputFactory.newFactory();
        XMLStreamWriter xsw = xof.createXMLStreamWriter(sw);
        return new ToXmlGenerator(ctxt, stdFeatures, xmlFeatures, null, xsw);
    }

    @Test
    public void testFeature_enumMethods() {
        int defaults = ToXmlGenerator.Feature.collectDefaults();
        Assert.assertEquals(0, defaults);

        for (ToXmlGenerator.Feature f : ToXmlGenerator.Feature.values()) {
            Assert.assertFalse(f.enabledByDefault());
            Assert.assertTrue(f.getMask() > 0);
            Assert.assertTrue(f.enabledIn(f.getMask()));
            Assert.assertFalse(f.enabledIn(0));
            Assert.assertEquals(f, ToXmlGenerator.Feature.valueOf(f.name()));
        }
    }

    @Test
    public void testFeatureConfiguration_enableDisableConfigure() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);

        Assert.assertFalse(gen.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        gen.enable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        Assert.assertTrue(gen.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));

        gen.disable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        Assert.assertFalse(gen.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));

        gen.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
        Assert.assertTrue(gen.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        gen.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, false);
        Assert.assertFalse(gen.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));

        int oldMask = gen.getFormatFeatures();
        gen.overrideFormatFeatures(ToXmlGenerator.Feature.WRITE_XML_1_1.getMask(), ToXmlGenerator.Feature.WRITE_XML_1_1.getMask());
        Assert.assertTrue(gen.isEnabled(ToXmlGenerator.Feature.WRITE_XML_1_1));

        gen.overrideFormatFeatures(ToXmlGenerator.Feature.WRITE_XML_1_1.getMask(), ToXmlGenerator.Feature.WRITE_XML_1_1.getMask());
        Assert.assertEquals(oldMask | ToXmlGenerator.Feature.WRITE_XML_1_1.getMask(), gen.getFormatFeatures());
    }

    @Test
    public void testInitGenerator_variations() throws Exception {
        StringWriter sw1 = new StringWriter();
        ToXmlGenerator gen1 = createGenerator(sw1, 0, ToXmlGenerator.Feature.WRITE_XML_DECLARATION.getMask());
        gen1.initGenerator();
        gen1.initGenerator();
        Assert.assertTrue(sw1.toString().contains("<?xml"));

        StringWriter sw2 = new StringWriter();
        ToXmlGenerator gen2 = createGenerator(sw2, 0, ToXmlGenerator.Feature.WRITE_XML_1_1.getMask());
        gen2.initGenerator();
        Assert.assertTrue(sw2.toString().contains("1.1"));

        StringWriter sw3 = new StringWriter();
        ToXmlGenerator gen3 = createGenerator(sw3, 0, 0);
        gen3.initGenerator();
        Assert.assertEquals("", sw3.toString());
    }

    @Test
    public void testPrettyPrinter_andDefaults() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);

        Assert.assertNotNull(gen._constructDefaultPrettyPrinter());
        Assert.assertTrue(gen.canWriteFormattedNumbers());
        Assert.assertEquals(-1, gen.getOutputBuffered());
        Assert.assertNotNull(gen.getOutputTarget());
        Assert.assertNotNull(gen.getStaxWriter());
        Assert.assertTrue(gen.inRoot());

        DefaultXmlPrettyPrinter pp = new DefaultXmlPrettyPrinter();
        gen.setPrettyPrinter(pp);
        gen.setPrettyPrinter(null);
    }

    @Test
    public void testSetNextNameAndFlags() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);

        Assert.assertTrue(gen.setNextNameIfMissing(new QName("elem1")));
        Assert.assertFalse(gen.setNextNameIfMissing(new QName("elem2")));
        gen.setNextName(new QName("elem3"));

        gen.setNextIsAttribute(true);
        gen.setNextIsAttribute(false);
        gen.setNextIsUnwrapped(true);
        gen.setNextIsUnwrapped(false);
        gen.setNextIsCData(true);
        gen.setNextIsCData(false);
    }

    @Test
    public void testWrappedValue_noPrettyPrinter() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);

        QName wrapper = new QName("wrapper");
        QName wrapped = new QName("item");

        gen.startWrappedValue(wrapper, wrapped);
        gen.writeString("val1");
        gen.finishWrappedValue(wrapper, wrapped);

        gen.startWrappedValue(null, wrapped);
        gen.finishWrappedValue(null, wrapped);

        Assert.assertTrue(sw.toString().contains("<wrapper>"));
        Assert.assertTrue(sw.toString().contains("</wrapper>"));
    }

    @Test
    public void testWrappedValue_withPrettyPrinter() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);
        gen.setPrettyPrinter(new DefaultXmlPrettyPrinter());

        QName wrapper = new QName("wrapper");
        QName wrapped = new QName("item");

        gen.startWrappedValue(wrapper, wrapped);
        gen.writeString("val1");
        gen.finishWrappedValue(wrapper, wrapped);

        Assert.assertTrue(sw.toString().contains("wrapper"));
    }

    @Test
    public void testObjectAndArrayStructure_withoutPrettyPrinter() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);

        gen.setNextName(new QName("root"));
        gen.writeStartObject();
        Assert.assertFalse(gen.inRoot());

        gen.writeFieldName("child");
        gen.writeStartObject();
        gen.writeStringField("prop", "val");
        gen.writeEndObject();

        gen.setNextName(new QName("arr"));
        gen.writeStartArray();
        gen.setNextName(new QName("item"));
        gen.writeString("arrayItem");
        gen.writeEndArray();

        gen.writeEndObject();
        Assert.assertTrue(gen.inRoot());
    }

    @Test
    public void testObjectAndArrayStructure_withPrettyPrinter() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);
        gen.setPrettyPrinter(new DefaultXmlPrettyPrinter());

        gen.setNextName(new QName("root"));
        gen.writeStartObject();
        gen.writeFieldName(new SerializedString("child"));
        gen.writeStartObject();
        gen.setNextIsAttribute(true);
        gen.setNextName(new QName("attr"));
        gen.writeString("val");
        gen.writeEndObject();

        gen.setNextName(new QName("arr"));
        gen.writeStartArray();
        gen.setNextName(new QName("item"));
        gen.writeString("elem");
        gen.writeEndArray();

        gen.writeEndObject();
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndObject_whenNotInObject_throws() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);
        gen.writeEndObject();
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEndArray_whenNotInArray_throws() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);
        gen.writeEndArray();
    }

    @Test(expected = JsonGenerationException.class)
    public void testHandleEndObject_emptyStack_throws() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);
        gen._handleEndObject();
    }

    @Test
    public void testMissingName_throwsIllegalStateException() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);
        try {
            gen.writeString("noName");
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("No element/attribute name"));
        }
    }

    @Test
    public void testWriteString_allBranches() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);

        gen.setNextName(new QName("root"));
        gen.writeStartObject();

        gen.setNextName(new QName("attr1"));
        gen.setNextIsAttribute(true);
        gen.writeString("attrVal");

        gen.setNextName(new QName("elem1"));
        gen.writeString("textVal");

        gen.setNextName(new QName("cdata1"));
        gen.setNextIsCData(true);
        gen.writeString("cdataContent");

        gen.setNextName(new QName("unwrapped1"));
        gen.setNextIsUnwrapped(true);
        gen.writeString("unwrappedContent");

        gen.setNextName(new QName("unwrappedCData"));
        gen.setNextIsUnwrapped(true);
        gen.setNextIsCData(true);
        gen.writeString("unwrappedCDataContent");

        gen.setNextName(new QName("charsAttr"));
        gen.setNextIsAttribute(true);
        char[] ch = "charsVal".toCharArray();
        gen.writeString(ch, 0, ch.length);

        gen.setNextName(new QName("charsElem"));
        gen.writeString(ch, 0, ch.length);

        gen.setNextName(new QName("charsCdata"));
        gen.setNextIsCData(true);
        gen.writeString(ch, 0, ch.length);

        gen.setNextName(new QName("charsUnwrapped"));
        gen.setNextIsUnwrapped(true);
        gen.writeString(ch, 0, ch.length);

        gen.setNextName(new QName("charsUnwrappedCData"));
        gen.setNextIsUnwrapped(true);
        gen.setNextIsCData(true);
        gen.writeString(ch, 0, ch.length);

        gen.setNextName(new QName("serializableString"));
        gen.writeString(new SerializedString("serializableVal"));

        gen.writeEndObject();
    }

    @Test
    public void testWriteString_withPrettyPrinter() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);
        gen.setPrettyPrinter(new DefaultXmlPrettyPrinter());

        gen.setNextName(new QName("root"));
        gen.writeStartObject();

        gen.setNextName(new QName("elem1"));
        gen.writeString("textVal");

        gen.setNextName(new QName("cdata1"));
        gen.setNextIsCData(true);
        gen.writeString("cdataVal");

        char[] ch = "chars".toCharArray();
        gen.setNextName(new QName("chars1"));
        gen.writeString(ch, 0, ch.length);

        gen.setNextName(new QName("charsCdata"));
        gen.setNextIsCData(true);
        gen.writeString(ch, 0, ch.length);

        gen.writeEndObject();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawUTF8String_unsupported() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);
        gen.writeRawUTF8String(new byte[]{1, 2}, 0, 2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteUTF8String_unsupported() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);
        gen.writeUTF8String(new byte[]{1, 2}, 0, 2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawValue_serializableString_unsupported() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);
        gen.writeRawValue(new SerializedString("raw"));
    }

    @Test
    public void testWriteRaw_methods() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);

        try {
            gen.writeRaw("<raw1/>");
            gen.writeRaw("<raw2/>", 0, 7);
            char[] ch = "<raw3/>".toCharArray();
            gen.writeRaw(ch, 0, ch.length);
            gen.writeRaw('x');

            gen.setNextName(new QName("val1"));
            gen.writeRawValue("<inner1/>");

            gen.setNextName(new QName("val2"));
            gen.writeRawValue("<inner2/>", 0, 9);

            gen.setNextName(new QName("val3"));
            gen.writeRawValue(ch, 0, ch.length);

            gen.setNextName(new QName("attrRaw1"));
            gen.setNextIsAttribute(true);
            gen.writeRawValue("attrRawVal");

            gen.setNextName(new QName("attrRaw2"));
            gen.setNextIsAttribute(true);
            gen.writeRawValue("attrRawVal", 0, 4);

            gen.setNextName(new QName("attrRaw3"));
            gen.setNextIsAttribute(true);
            gen.writeRawValue(ch, 0, ch.length);
        } catch (JsonGenerationException e) {
            Assert.assertTrue(e.getMessage().contains("does not implement Stax2 API"));
        }
    }

    @Test
    public void testWriteBinary_allBranches() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);

        gen.setNextName(new QName("root"));
        gen.writeStartObject();

        gen.setNextName(new QName("binNull"));
        gen.writeBinary(Base64Variants.MIME, null, 0, 0);

        byte[] data = new byte[]{1, 2, 3, 4, 5};

        gen.setNextName(new QName("binFull"));
        gen.writeBinary(Base64Variants.MIME, data, 0, data.length);

        gen.setNextName(new QName("binPartial"));
        gen.writeBinary(Base64Variants.MIME, data, 1, 3);

        gen.setNextName(new QName("binAttr"));
        gen.setNextIsAttribute(true);
        gen.writeBinary(Base64Variants.MIME, data, 0, data.length);

        gen.setNextName(new QName("binUnwrapped"));
        gen.setNextIsUnwrapped(true);
        gen.writeBinary(Base64Variants.MIME, data, 0, data.length);

        gen.writeEndObject();

        StringWriter swPP = new StringWriter();
        ToXmlGenerator genPP = createGenerator(swPP);
        genPP.setPrettyPrinter(new DefaultXmlPrettyPrinter());
        genPP.setNextName(new QName("binPP"));
        genPP.writeBinary(Base64Variants.MIME, data, 0, data.length);
    }

    @Test
    public void testWriteBoolean_allBranches() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);

        gen.setNextName(new QName("root"));
        gen.writeStartObject();

        gen.setNextName(new QName("boolAttr"));
        gen.setNextIsAttribute(true);
        gen.writeBoolean(true);

        gen.setNextName(new QName("boolUnwrapped"));
        gen.setNextIsUnwrapped(true);
        gen.writeBoolean(false);

        gen.setNextName(new QName("boolElem"));
        gen.writeBoolean(true);

        gen.writeEndObject();

        StringWriter swPP = new StringWriter();
        ToXmlGenerator genPP = createGenerator(swPP);
        genPP.setPrettyPrinter(new DefaultXmlPrettyPrinter());
        genPP.setNextName(new QName("boolPP"));
        genPP.writeBoolean(false);
    }

    @Test
    public void testWriteNull_allBranches() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);

        gen.setNextName(new QName("root"));
        gen.writeStartObject();

        gen.setNextName(new QName("nullAttr"));
        gen.setNextIsAttribute(true);
        gen.writeNull();

        gen.setNextName(new QName("nullUnwrapped"));
        gen.setNextIsUnwrapped(true);
        gen.writeNull();

        gen.setNextName(new QName("nullElem"));
        gen.writeNull();

        gen.writeEndObject();

        StringWriter swPP = new StringWriter();
        ToXmlGenerator genPP = createGenerator(swPP);
        genPP.setPrettyPrinter(new DefaultXmlPrettyPrinter());
        genPP.setNextName(new QName("nullPP"));
        genPP.writeNull();
    }

    @Test
    public void testWriteNumber_intAndLong() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);

        gen.setNextName(new QName("root"));
        gen.writeStartObject();

        gen.setNextName(new QName("intAttr"));
        gen.setNextIsAttribute(true);
        gen.writeNumber(10);

        gen.setNextName(new QName("intUnwrapped"));
        gen.setNextIsUnwrapped(true);
        gen.writeNumber(-5);

        gen.setNextName(new QName("intElem"));
        gen.writeNumber(0);

        gen.setNextName(new QName("longAttr"));
        gen.setNextIsAttribute(true);
        gen.writeNumber(100L);

        gen.setNextName(new QName("longUnwrapped"));
        gen.setNextIsUnwrapped(true);
        gen.writeNumber(-500L);

        gen.setNextName(new QName("longElem"));
        gen.writeNumber(0L);

        gen.writeEndObject();

        StringWriter swPP = new StringWriter();
        ToXmlGenerator genPP = createGenerator(swPP);
        genPP.setPrettyPrinter(new DefaultXmlPrettyPrinter());
        genPP.setNextName(new QName("intPP"));
        genPP.writeNumber(1);
        genPP.setNextName(new QName("longPP"));
        genPP.writeNumber(2L);
    }

    @Test
    public void testWriteNumber_doubleAndFloat() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);

        gen.setNextName(new QName("root"));
        gen.writeStartObject();

        gen.setNextName(new QName("doubleAttr"));
        gen.setNextIsAttribute(true);
        gen.writeNumber(1.23d);

        gen.setNextName(new QName("doubleUnwrapped"));
        gen.setNextIsUnwrapped(true);
        gen.writeNumber(-4.56d);

        gen.setNextName(new QName("doubleElem"));
        gen.writeNumber(0.0d);

        gen.setNextName(new QName("floatAttr"));
        gen.setNextIsAttribute(true);
        gen.writeNumber(7.89f);

        gen.setNextName(new QName("floatUnwrapped"));
        gen.setNextIsUnwrapped(true);
        gen.writeNumber(-0.12f);

        gen.setNextName(new QName("floatElem"));
        gen.writeNumber(0.0f);

        gen.writeEndObject();

        StringWriter swPP = new StringWriter();
        ToXmlGenerator genPP = createGenerator(swPP);
        genPP.setPrettyPrinter(new DefaultXmlPrettyPrinter());
        genPP.setNextName(new QName("doublePP"));
        genPP.writeNumber(3.14d);
        genPP.setNextName(new QName("floatPP"));
        genPP.writeNumber(2.71f);
    }

    @Test
    public void testWriteNumber_bigDecimalAndBigInteger() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);

        gen.setNextName(new QName("root"));
        gen.writeStartObject();

        gen.setNextName(new QName("decNull"));
        gen.writeNumber((BigDecimal) null);

        gen.setNextName(new QName("intNull"));
        gen.writeNumber((BigInteger) null);

        gen.setNextName(new QName("decAttr"));
        gen.setNextIsAttribute(true);
        gen.writeNumber(new BigDecimal("123.45"));

        gen.setNextName(new QName("decUnwrapped"));
        gen.setNextIsUnwrapped(true);
        gen.writeNumber(new BigDecimal("-67.89"));

        gen.setNextName(new QName("decElem"));
        gen.writeNumber(BigDecimal.ZERO);

        gen.setNextName(new QName("bigIntAttr"));
        gen.setNextIsAttribute(true);
        gen.writeNumber(BigInteger.valueOf(999999999L));

        gen.setNextName(new QName("bigIntUnwrapped"));
        gen.setNextIsUnwrapped(true);
        gen.writeNumber(BigInteger.valueOf(-88888888L));

        gen.setNextName(new QName("bigIntElem"));
        gen.writeNumber(BigInteger.ZERO);

        gen.setNextName(new QName("encodedNumber"));
        gen.writeNumber("12345");

        gen.writeEndObject();

        StringWriter swPlain = new StringWriter();
        ToXmlGenerator genPlain = createGenerator(swPlain, JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask(), 0);
        genPlain.setNextName(new QName("rootPlain"));
        genPlain.writeStartObject();
        genPlain.setNextName(new QName("decPlainAttr"));
        genPlain.setNextIsAttribute(true);
        genPlain.writeNumber(new BigDecimal("1e-7"));
        genPlain.setNextName(new QName("decPlainUnwrapped"));
        genPlain.setNextIsUnwrapped(true);
        genPlain.writeNumber(new BigDecimal("2e-7"));
        genPlain.setNextName(new QName("decPlainElem"));
        genPlain.writeNumber(new BigDecimal("3e-7"));
        genPlain.writeEndObject();

        StringWriter swPP = new StringWriter();
        ToXmlGenerator genPP = createGenerator(swPP);
        genPP.setPrettyPrinter(new DefaultXmlPrettyPrinter());
        genPP.setNextName(new QName("decPP"));
        genPP.writeNumber(new BigDecimal("123.456"));
        genPP.setNextName(new QName("bigIntPP"));
        genPP.writeNumber(BigInteger.TEN);
    }

    @Test
    public void testFlushAndClose() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw,
                JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM.getMask() |
                JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT.getMask() |
                JsonGenerator.Feature.AUTO_CLOSE_TARGET.getMask(), 0);

        gen.setNextName(new QName("root"));
        gen.writeStartObject();
        gen.setNextName(new QName("arr"));
        gen.writeStartArray();

        gen.flush();
        gen.close();
        gen._releaseBuffers();
    }

    @Test
    public void testWriteRepeatedFieldName_andFieldVerificationErrors() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = createGenerator(sw);

        gen.setNextName(new QName("root"));
        gen.writeStartObject();
        gen.setNextName(new QName("field1"));
        gen.writeRepeatedFieldName();

        try {
            gen.writeRepeatedFieldName();
            Assert.fail("Expected JsonGenerationException for unexpected field name status");
        } catch (JsonGenerationException e) {
            Assert.assertTrue(e.getMessage().contains("Can not write a field name"));
        }

        try {
            gen.writeFieldName("field2");
            gen.writeFieldName("field3");
            Assert.fail("Expected JsonGenerationException for repeated field name without value");
        } catch (JsonGenerationException e) {
            Assert.assertTrue(e.getMessage().contains("Can not write a field name"));
        }
    }
}
