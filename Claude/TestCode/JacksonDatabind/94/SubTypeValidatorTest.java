package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link SubTypeValidator}.
 *
 * หมายเหตุ: การทดสอบ branch ที่เกี่ยวกับ class ที่ชื่อเต็มขึ้นต้นด้วย "org.springframework."
 * (เช่น AbstractPointcutAdvisor / AbstractApplicationContext) ไม่สามารถทำได้จริงในไฟล์นี้
 * เพราะต้องมี class จริงที่อยู่ใน package "org.springframework.*" ซึ่งไม่มี dependency
 * ของ Spring Framework ให้ใช้งาน (ไม่มีข้อมูลเพิ่มเติมใน dependencies) และไม่สามารถสร้าง
 * class ใน package อื่นภายในไฟล์เดียวกันนี้ได้ (Java อนุญาตแค่ 1 package declaration ต่อไฟล์)
 * ดังนั้นจึงข้ามการทดสอบ branch นี้โดยตรง แต่ยังคง cover branch อื่น ๆ ของ method ให้ได้มากที่สุด
 */
public class SubTypeValidatorTest {

    private SubTypeValidator validator;
    private DeserializationContext realContext;

    @Before
    public void setUp() throws Exception {
        validator = SubTypeValidator.instance();
        realContext = captureRealContext();
    }

    /**
     * สร้าง DeserializationContext จริงโดยใช้ ObjectMapper และ custom deserializer
     * เพื่อ capture instance ที่ถูกส่งเข้ามาจริงระหว่างกระบวนการ deserialize
     * (ไม่ได้ mock ใด ๆ ทั้งสิ้น เป็น object จริงจาก Jackson core/databind)
     */
    private DeserializationContext captureRealContext() throws IOException {
        final DeserializationContext[] holder = new DeserializationContext[1];
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(String.class, new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                holder[0] = ctxt;
                return p.getText();
            }
        });
        mapper.registerModule(module);
        mapper.readValue("\"test\"", String.class);
        return holder[0];
    }

    private JavaType getJavaType(Class<?> cls) {
        return new ObjectMapper().constructType(cls);
    }

    // ---------------------------------------------------------------
    // instance()
    // ---------------------------------------------------------------

    @Test
    public void testInstance_calledMultipleTimes_returnsSameSingleton() {
        SubTypeValidator instance1 = SubTypeValidator.instance();
        SubTypeValidator instance2 = SubTypeValidator.instance();
        assertNotNull(instance1);
        assertNotNull(instance2);
        assertSame("instance() should always return same singleton", instance1, instance2);
    }

    // ---------------------------------------------------------------
    // validateSubType() - normal / typical cases
    // ---------------------------------------------------------------

    @Test
    public void testValidateSubType_normalClass_doesNotThrowException() {
        JavaType type = getJavaType(String.class);
        try {
            validator.validateSubType(realContext, type);
        } catch (JsonMappingException e) {
            fail("Should not throw JsonMappingException for a normal, safe class: " + e.getMessage());
        }
    }

    @Test
    public void testValidateSubType_anotherNormalClass_doesNotThrowException() {
        JavaType type = getJavaType(Integer.class);
        try {
            validator.validateSubType(realContext, type);
        } catch (JsonMappingException e) {
            fail("Should not throw JsonMappingException for Integer.class: " + e.getMessage());
        }
    }

    // ---------------------------------------------------------------
    // validateSubType() - edge case: interface type (raw.isInterface() branch)
    // ---------------------------------------------------------------

    @Test
    public void testValidateSubType_interfaceType_doesNotThrowException() {
        JavaType type = getJavaType(Runnable.class);
        try {
            validator.validateSubType(realContext, type);
        } catch (JsonMappingException e) {
            fail("Should not throw JsonMappingException for interface type: " + e.getMessage());
        }
    }

    // ---------------------------------------------------------------
    // validateSubType() - edge case: null context on safe path (ctxt not used unless throwing)
    // ---------------------------------------------------------------

    @Test
    public void testValidateSubType_nullContextOnSafeClass_doesNotThrowException() {
        JavaType type = getJavaType(String.class);
        try {
            // ctxt is only referenced when an exception must be thrown; for a safe class
            // it should never be dereferenced, so passing null here must be safe.
            validator.validateSubType(null, type);
        } catch (Exception e) {
            fail("Should not throw any exception when ctxt is null but type is safe: " + e);
        }
    }

    // ---------------------------------------------------------------
    // validateSubType() - exception cases: illegal class names (JDK provided ones)
    // ---------------------------------------------------------------

    @Test(expected = JsonMappingException.class)
    public void testValidateSubType_illegalClassFileHandler_throwsJsonMappingException() throws Exception {
        JavaType type = getJavaType(java.util.logging.FileHandler.class);
        validator.validateSubType(realContext, type);
    }

    @Test(expected = JsonMappingException.class)
    public void testValidateSubType_illegalClassUnicastRemoteObject_throwsJsonMappingException() throws Exception {
        JavaType type = getJavaType(java.rmi.server.UnicastRemoteObject.class);
        validator.validateSubType(realContext, type);
    }

    @Test
    public void testValidateSubType_illegalClass_exceptionMessageContainsClassName() {
        JavaType type = getJavaType(java.util.logging.FileHandler.class);
        try {
            validator.validateSubType(realContext, type);
            fail("Expected JsonMappingException to be thrown");
        } catch (JsonMappingException e) {
            assertTrue("Exception message should mention the illegal class name",
                    e.getMessage().contains("java.util.logging.FileHandler"));
        }
    }

    // ---------------------------------------------------------------
    // validateSubType() - edge case: null type argument should raise NullPointerException
    // ---------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testValidateSubType_nullType_throwsNullPointerException() throws Exception {
        validator.validateSubType(realContext, null);
    }
}
