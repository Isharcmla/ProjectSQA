package com.fasterxml.jackson.databind.jsontype.impl;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.logging.FileHandler;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class SubTypeValidatorTest {

    private static class DynamicClassLoader extends ClassLoader {
        public DynamicClassLoader(ClassLoader parent) {
            super(parent);
        }

        public Class<?> define(String name, byte[] bytes) {
            return defineClass(name, bytes, 0, bytes.length);
        }
    }

    private static DynamicClassLoader classLoader;
    private static Class<?> springSafeClass;
    private static Class<?> springAdvisorClass;
    private static Class<?> springAdvisorSubClass;
    private static Class<?> springAppContextClass;
    private static Class<?> springAppContextSubClass;

    @BeforeClass
    public static void setUpClass() throws Exception {
        classLoader = new DynamicClassLoader(SubTypeValidatorTest.class.getClassLoader());

        springSafeClass = classLoader.define("org.springframework.SafeBean",
                createClassBytes("org.springframework.SafeBean", "java.lang.Object"));

        springAdvisorClass = classLoader.define("org.springframework.AbstractPointcutAdvisor",
                createClassBytes("org.springframework.AbstractPointcutAdvisor", "java.lang.Object"));

        springAdvisorSubClass = classLoader.define("org.springframework.MyAdvisorSubclass",
                createClassBytes("org.springframework.MyAdvisorSubclass", "org.springframework.AbstractPointcutAdvisor"));

        springAppContextClass = classLoader.define("org.springframework.AbstractApplicationContext",
                createClassBytes("org.springframework.AbstractApplicationContext", "java.lang.Object"));

        springAppContextSubClass = classLoader.define("org.springframework.MyAppContextSubclass",
                createClassBytes("org.springframework.MyAppContextSubclass", "org.springframework.AbstractApplicationContext"));
    }

    private static byte[] createClassBytes(String className, String superClassName) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        dos.writeInt(0xCAFEBABE);
        dos.writeShort(0);
        dos.writeShort(49);
        dos.writeShort(5);

        dos.writeByte(7);
        dos.writeShort(2);

        dos.writeByte(1);
        dos.writeUTF(className.replace('.', '/'));

        dos.writeByte(7);
        dos.writeShort(4);

        dos.writeByte(1);
        dos.writeUTF(superClassName.replace('.', '/'));

        dos.writeShort(0x0001 | 0x0020);
        dos.writeShort(1);
        dos.writeShort(3);
        dos.writeShort(0);
        dos.writeShort(0);
        dos.writeShort(0);
        dos.writeShort(0);

        return baos.toByteArray();
    }

    @Test
    public void testInstance_returnsSingletonInstance() {
        SubTypeValidator instance1 = SubTypeValidator.instance();
        SubTypeValidator instance2 = SubTypeValidator.instance();

        Assert.assertNotNull(instance1);
        Assert.assertSame(instance1, instance2);
    }

    @Test
    public void testConstructor_createsNewInstance() {
        SubTypeValidator validator = new SubTypeValidator();
        Assert.assertNotNull(validator);
        Assert.assertNotNull(validator._cfgIllegalClassNames);
    }

    @Test
    public void testValidateSubType_safeJdkTypes_noExceptionThrown() throws Exception {
        SubTypeValidator validator = SubTypeValidator.instance();

        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        JavaType intType = TypeFactory.defaultInstance().constructType(Integer.class);
        JavaType listType = TypeFactory.defaultInstance().constructType(ArrayList.class);
        JavaType objectType = TypeFactory.defaultInstance().constructType(Object.class);

        validator.validateSubType(null, stringType);
        validator.validateSubType(null, intType);
        validator.validateSubType(null, listType);
        validator.validateSubType(null, objectType);
    }

    @Test
    public void testValidateSubType_illegalJdkClassFileHandler_throwsJsonMappingException() {
        SubTypeValidator validator = SubTypeValidator.instance();
        JavaType type = TypeFactory.defaultInstance().constructType(FileHandler.class);

        try {
            validator.validateSubType(null, type);
            Assert.fail("Expected JsonMappingException for illegal class FileHandler");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal type (" + FileHandler.class.getName() + ") to deserialize"));
        }
    }

    @Test
    public void testValidateSubType_illegalJdkClassUnicastRemoteObject_throwsJsonMappingException() {
        SubTypeValidator validator = SubTypeValidator.instance();
        JavaType type = TypeFactory.defaultInstance().constructType(UnicastRemoteObject.class);

        try {
            validator.validateSubType(null, type);
            Assert.fail("Expected JsonMappingException for illegal class UnicastRemoteObject");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal type (" + UnicastRemoteObject.class.getName() + ") to deserialize"));
        }
    }

    @Test
    public void testValidateSubType_springPrefixSafeClass_noExceptionThrown() throws Exception {
        SubTypeValidator validator = SubTypeValidator.instance();
        JavaType type = TypeFactory.defaultInstance().constructType(springSafeClass);

        validator.validateSubType(null, type);
    }

    @Test
    public void testValidateSubType_springAbstractPointcutAdvisorDirect_throwsJsonMappingException() {
        SubTypeValidator validator = SubTypeValidator.instance();
        JavaType type = TypeFactory.defaultInstance().constructType(springAdvisorClass);

        try {
            validator.validateSubType(null, type);
            Assert.fail("Expected JsonMappingException for Spring AbstractPointcutAdvisor");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal type (" + springAdvisorClass.getName() + ") to deserialize"));
        }
    }

    @Test
    public void testValidateSubType_springAbstractPointcutAdvisorSubclass_throwsJsonMappingException() {
        SubTypeValidator validator = SubTypeValidator.instance();
        JavaType type = TypeFactory.defaultInstance().constructType(springAdvisorSubClass);

        try {
            validator.validateSubType(null, type);
            Assert.fail("Expected JsonMappingException for subclass of AbstractPointcutAdvisor");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal type (" + springAdvisorSubClass.getName() + ") to deserialize"));
        }
    }

    @Test
    public void testValidateSubType_springAbstractApplicationContextDirect_throwsJsonMappingException() {
        SubTypeValidator validator = SubTypeValidator.instance();
        JavaType type = TypeFactory.defaultInstance().constructType(springAppContextClass);

        try {
            validator.validateSubType(null, type);
            Assert.fail("Expected JsonMappingException for Spring AbstractApplicationContext");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal type (" + springAppContextClass.getName() + ") to deserialize"));
        }
    }

    @Test
    public void testValidateSubType_springAbstractApplicationContextSubclass_throwsJsonMappingException() {
        SubTypeValidator validator = SubTypeValidator.instance();
        JavaType type = TypeFactory.defaultInstance().constructType(springAppContextSubClass);

        try {
            validator.validateSubType(null, type);
            Assert.fail("Expected JsonMappingException for subclass of AbstractApplicationContext");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal type (" + springAppContextSubClass.getName() + ") to deserialize"));
        }
    }

    @Test
    public void testValidateSubType_withNonNullDeserializationContext_throwsJsonMappingException() {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        SubTypeValidator validator = SubTypeValidator.instance();
        JavaType type = TypeFactory.defaultInstance().constructType(FileHandler.class);

        try {
            validator.validateSubType(ctxt, type);
            Assert.fail("Expected JsonMappingException with DeserializationContext");
        } catch (JsonMappingException e) {
            Assert.assertNotNull(e.getMessage());
            Assert.assertTrue(e.getMessage().contains("Illegal type (" + FileHandler.class.getName() + ") to deserialize"));
        }
    }
}
