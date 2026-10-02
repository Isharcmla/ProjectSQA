package com.fasterxml.jackson.databind.jsontype.impl;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class SubTypeValidatorTest {

    private SubTypeValidator validator;
    private DynamicClassLoader dynamicClassLoader;

    @Before
    public void setUp() {
        validator = SubTypeValidator.instance();
        dynamicClassLoader = new DynamicClassLoader(getClass().getClassLoader());
    }

    @Test
    public void testInstance_returnsSingletonInstance() {
        SubTypeValidator instance1 = SubTypeValidator.instance();
        SubTypeValidator instance2 = SubTypeValidator.instance();
        Assert.assertNotNull(instance1);
        Assert.assertSame(instance1, instance2);
    }

    @Test
    public void testConstructor_protectedInstantiation() {
        SubTypeValidator customValidator = new SubTypeValidator();
        Assert.assertNotNull(customValidator);
        Assert.assertNotNull(customValidator._cfgIllegalClassNames);
    }

    @Test
    public void testValidateSubType_validClass_success() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        validator.validateSubType(null, type);
    }

    @Test
    public void testValidateSubType_validInterface_success() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Comparable.class);
        validator.validateSubType(null, type);
    }

    @Test
    public void testValidateSubType_defaultIllegalClass_FileHandler_throwsException() {
        JavaType type = TypeFactory.defaultInstance().constructType(java.util.logging.FileHandler.class);
        try {
            validator.validateSubType(null, type);
            Assert.fail("Expected JsonMappingException for illegal class: FileHandler");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal type (java.util.logging.FileHandler) to deserialize"));
        }
    }

    @Test
    public void testValidateSubType_defaultIllegalClass_UnicastRemoteObject_throwsException() {
        JavaType type = TypeFactory.defaultInstance().constructType(java.rmi.server.UnicastRemoteObject.class);
        try {
            validator.validateSubType(null, type);
            Assert.fail("Expected JsonMappingException for illegal class: UnicastRemoteObject");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal type (java.rmi.server.UnicastRemoteObject) to deserialize"));
        }
    }

    @Test
    public void testValidateSubType_customIllegalClassNames_throwsException() {
        SubTypeValidator customValidator = new SubTypeValidator();
        Set<String> illegal = new HashSet<String>();
        illegal.add(Integer.class.getName());
        customValidator._cfgIllegalClassNames = illegal;

        JavaType type = TypeFactory.defaultInstance().constructType(Integer.class);
        try {
            customValidator.validateSubType(null, type);
            Assert.fail("Expected JsonMappingException for custom illegal class");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal type (java.lang.Integer) to deserialize"));
        }
    }

    @Test
    public void testValidateSubType_springPrefix_safeClass_success() throws Exception {
        Class<?> safeSpringClass = dynamicClassLoader.createClass(
                "org.springframework.custom.SafeService",
                "java.lang.Object",
                false
        );
        JavaType type = TypeFactory.defaultInstance().constructType(safeSpringClass);
        validator.validateSubType(null, type);
    }

    @Test
    public void testValidateSubType_springPrefix_interface_success() throws Exception {
        Class<?> springInterface = dynamicClassLoader.createClass(
                "org.springframework.custom.SpringServiceInterface",
                "java.lang.Object",
                true
        );
        JavaType type = TypeFactory.defaultInstance().constructType(springInterface);
        validator.validateSubType(null, type);
    }

    @Test
    public void testValidateSubType_springPrefix_directAbstractPointcutAdvisor_throwsException() throws Exception {
        Class<?> advisorClass = dynamicClassLoader.createClass(
                "org.springframework.aop.support.AbstractPointcutAdvisor",
                "java.lang.Object",
                false
        );
        JavaType type = TypeFactory.defaultInstance().constructType(advisorClass);
        try {
            validator.validateSubType(null, type);
            Assert.fail("Expected JsonMappingException for AbstractPointcutAdvisor");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal type (org.springframework.aop.support.AbstractPointcutAdvisor) to deserialize"));
        }
    }

    @Test
    public void testValidateSubType_springPrefix_subclassOfAbstractPointcutAdvisor_throwsException() throws Exception {
        Class<?> superAdvisor = dynamicClassLoader.createClass(
                "org.springframework.custom.advisor.AbstractPointcutAdvisor",
                "java.lang.Object",
                false
        );
        Class<?> customAdvisor = dynamicClassLoader.createClass(
                "org.springframework.custom.advisor.MyCustomAdvisor",
                superAdvisor.getName(),
                false
        );
        JavaType type = TypeFactory.defaultInstance().constructType(customAdvisor);
        try {
            validator.validateSubType(null, type);
            Assert.fail("Expected JsonMappingException for subclass of AbstractPointcutAdvisor");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal type (org.springframework.custom.advisor.MyCustomAdvisor) to deserialize"));
        }
    }

    @Test
    public void testValidateSubType_springPrefix_directAbstractApplicationContext_throwsException() throws Exception {
        Class<?> contextClass = dynamicClassLoader.createClass(
                "org.springframework.context.support.AbstractApplicationContext",
                "java.lang.Object",
                false
        );
        JavaType type = TypeFactory.defaultInstance().constructType(contextClass);
        try {
            validator.validateSubType(null, type);
            Assert.fail("Expected JsonMappingException for AbstractApplicationContext");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal type (org.springframework.context.support.AbstractApplicationContext) to deserialize"));
        }
    }

    @Test
    public void testValidateSubType_springPrefix_subclassOfAbstractApplicationContext_throwsException() throws Exception {
        Class<?> superContext = dynamicClassLoader.createClass(
                "org.springframework.custom.context.AbstractApplicationContext",
                "java.lang.Object",
                false
        );
        Class<?> customContext = dynamicClassLoader.createClass(
                "org.springframework.custom.context.MyCustomApplicationContext",
                superContext.getName(),
                false
        );
        JavaType type = TypeFactory.defaultInstance().constructType(customContext);
        try {
            validator.validateSubType(null, type);
            Assert.fail("Expected JsonMappingException for subclass of AbstractApplicationContext");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Illegal type (org.springframework.custom.context.MyCustomApplicationContext) to deserialize"));
        }
    }

    @Test
    public void testDefaultNoDeserClassNames_isUnmodifiable() {
        try {
            SubTypeValidator.DEFAULT_NO_DESER_CLASS_NAMES.add("some.class.Name");
            Assert.fail("DEFAULT_NO_DESER_CLASS_NAMES should be unmodifiable");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    private static class DynamicClassLoader extends ClassLoader {
        public DynamicClassLoader(ClassLoader parent) {
            super(parent);
        }

        public Class<?> createClass(String className, String superClassName, boolean isInterface) throws Exception {
            byte[] bytecode = dumpClass(className, superClassName, isInterface);
            return defineClass(className, bytecode, 0, bytecode.length);
        }

        private byte[] dumpClass(String className, String superClassName, boolean isInterface) throws Exception {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream dos = new DataOutputStream(baos);

            dos.writeInt(0xCAFEBABE);
            dos.writeShort(0);
            dos.writeShort(50);
            dos.writeShort(5);

            dos.writeByte(7);
            dos.writeShort(2);

            dos.writeByte(1);
            dos.writeUTF(className.replace('.', '/'));

            dos.writeByte(7);
            dos.writeShort(4);

            dos.writeByte(1);
            dos.writeUTF(superClassName.replace('.', '/'));

            int accessFlags = 0x0021;
            if (isInterface) {
                accessFlags = 0x0601;
            }
            dos.writeShort(accessFlags);
            dos.writeShort(1);
            dos.writeShort(3);
            dos.writeShort(0);
            dos.writeShort(0);
            dos.writeShort(0);
            dos.writeShort(0);

            dos.flush();
            return baos.toByteArray();
        }
    }
}
