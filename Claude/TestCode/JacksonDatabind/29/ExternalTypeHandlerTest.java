package com.fasterxml.jackson.databind.deser.impl;

import java.io.IOException;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;

/**
 * JUnit 4 test suite for {@link ExternalTypeHandler}.
 *
 * หมายเหตุ: SettableBeanProperty, TypeDeserializer และ DeserializationContext
 * เป็น abstract class ภายในไลบรารี Jackson ที่มี API ภายในซับซ้อนมาก (constructor
 * และ abstract method จำนวนมากที่ไม่ได้ถูกให้ข้อมูลมาอย่างครบถ้วนใน source_code ที่ให้มา)
 * เนื่องจากข้อกำหนดห้ามใช้ mocking framework และห้ามเดา API ที่ไม่ได้ให้มา
 * จึงไม่สามารถสร้าง instance จริงของคลาสเหล่านี้เพื่อทดสอบ "found" branch
 * (กรณีที่ property ถูกพบใน _nameToPropertyIndex และมีการ deserialize จริง) ได้
 * Test suite นี้จึงเน้นทดสอบผ่าน public API จริงในกรณีที่สามารถทำได้โดยไม่ต้อง
 * สร้าง instance ของ abstract class ดังกล่าว เช่น กรณี property ไม่พบ (false branch),
 * กรณี properties array ว่าง (loop ไม่ทำงาน), และกรณีที่ควร throw NullPointerException
 * เมื่อส่ง null เข้าไปในจุดที่ต้องใช้ collaborator object เหล่านั้น
 */
public class ExternalTypeHandlerTest
{
    // ---------------------------------------------------------------
    // Builder tests
    // ---------------------------------------------------------------

    @Test
    public void testBuild_withNoPropertiesAdded_returnsNonNullHandler()
    {
        ExternalTypeHandler.Builder builder = new ExternalTypeHandler.Builder();
        ExternalTypeHandler handler = builder.build();
        assertNotNull(handler);
    }

    @Test(expected = NullPointerException.class)
    public void testAddExternal_withNullArguments_throwsNullPointerException()
    {
        // typeDeser.getPropertyName() จะถูกเรียกภายใน ExtTypedProperty constructor
        // เมื่อ typeDeser เป็น null จะเกิด NullPointerException
        ExternalTypeHandler.Builder builder = new ExternalTypeHandler.Builder();
        builder.addExternal(null, null);
    }

    // ---------------------------------------------------------------
    // start() tests
    // ---------------------------------------------------------------

    @Test
    public void testStart_createsIndependentInstance_notSameReference()
    {
        ExternalTypeHandler.Builder builder = new ExternalTypeHandler.Builder();
        ExternalTypeHandler base = builder.build();

        ExternalTypeHandler started1 = base.start();
        ExternalTypeHandler started2 = base.start();

        assertNotNull(started1);
        assertNotNull(started2);
        assertNotSame(base, started1);
        assertNotSame(started1, started2);
    }

    // ---------------------------------------------------------------
    // handleTypePropertyValue tests
    // ---------------------------------------------------------------

    @Test
    public void testHandleTypePropertyValue_propertyNotFound_returnsFalse() throws IOException
    {
        ExternalTypeHandler handler = new ExternalTypeHandler.Builder().build().start();
        boolean result = handler.handleTypePropertyValue(null, null, "unknownProp", null);
        assertFalse(result);
    }

    @Test
    public void testHandleTypePropertyValue_emptyPropNameAndNullBean_returnsFalse() throws IOException
    {
        ExternalTypeHandler handler = new ExternalTypeHandler.Builder().build().start();
        // edge case: empty string property name, null bean
        boolean result = handler.handleTypePropertyValue(null, null, "", null);
        assertFalse(result);
    }

    @Test
    public void testHandleTypePropertyValue_onNonStartedHandler_returnsFalseForUnknownProperty()
            throws IOException
    {
        // handler ที่ยังไม่ได้ start() จะมี _typeIds และ _tokens เป็น null
        // แต่เนื่องจาก property ไม่ถูกพบ จึง return false ก่อนที่จะเข้าถึง field เหล่านั้น
        ExternalTypeHandler handler = new ExternalTypeHandler.Builder().build();
        boolean result = handler.handleTypePropertyValue(null, null, "x", null);
        assertFalse(result);
    }

    // ---------------------------------------------------------------
    // handlePropertyValue tests
    // ---------------------------------------------------------------

    @Test
    public void testHandlePropertyValue_propertyNotFound_returnsFalse() throws IOException
    {
        ExternalTypeHandler handler = new ExternalTypeHandler.Builder().build().start();
        boolean result = handler.handlePropertyValue(null, null, "someProp", new Object());
        assertFalse(result);
    }

    @Test
    public void testHandlePropertyValue_withRealParserPropertyNotFound_returnsFalse() throws IOException
    {
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser("\"value\"");
        parser.nextToken();
        try {
            ExternalTypeHandler handler = new ExternalTypeHandler.Builder().build().start();
            boolean result = handler.handlePropertyValue(parser, null, "notRegistered", null);
            assertFalse(result);
        } finally {
            parser.close();
        }
    }

    @Test
    public void testHandlePropertyValue_nullBeanAndUnknownProp_returnsFalse() throws IOException
    {
        // edge case: null bean, unknown property name
        ExternalTypeHandler handler = new ExternalTypeHandler.Builder().build().start();
        boolean result = handler.handlePropertyValue(null, null, "anotherUnknown", null);
        assertFalse(result);
    }

    // ---------------------------------------------------------------
    // complete(JsonParser, DeserializationContext, Object) tests
    // ---------------------------------------------------------------

    @Test
    public void testComplete_withNoProperties_returnsBeanUnchanged() throws IOException
    {
        ExternalTypeHandler handler = new ExternalTypeHandler.Builder().build().start();
        Object bean = new Object();
        Object result = handler.complete(null, null, bean);
        assertSame(bean, result);
    }

    @Test
    public void testComplete_withNoPropertiesAndNullBean_returnsNull() throws IOException
    {
        // edge case: null bean input, should just pass through as null (loop body never runs)
        ExternalTypeHandler handler = new ExternalTypeHandler.Builder().build().start();
        Object result = handler.complete(null, null, null);
        assertNull(result);
    }

    @Test
    public void testComplete_calledOnNonStartedHandler_returnsBeanUnchanged() throws IOException
    {
        // handler built but not started still has empty properties array,
        // so the loop body never executes and no NPE occurs on _typeIds/_tokens.
        ExternalTypeHandler handler = new ExternalTypeHandler.Builder().build();
        String bean = "myBean";
        Object result = handler.complete(null, null, bean);
        assertSame(bean, result);
    }

    // ---------------------------------------------------------------
    // complete(JsonParser, DeserializationContext, PropertyValueBuffer, PropertyBasedCreator) tests
    // ---------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testComplete_withCreatorBufferAndNullCreator_throwsNullPointerException() throws IOException
    {
        // With no properties registered, both loops over _properties are no-ops,
        // but creator.build(ctxt, buffer) is still invoked unconditionally.
        // Passing a null creator therefore triggers a NullPointerException,
        // exercising this overload of complete() without requiring a full
        // PropertyBasedCreator / PropertyValueBuffer instance.
        ExternalTypeHandler handler = new ExternalTypeHandler.Builder().build().start();
        handler.complete(null, null, null, null);
    }

    @Test(expected = NullPointerException.class)
    public void testComplete_withCreatorBufferOnNonStartedHandler_throwsNullPointerException()
            throws IOException
    {
        ExternalTypeHandler handler = new ExternalTypeHandler.Builder().build();
        handler.complete(null, null, null, null);
    }
}
