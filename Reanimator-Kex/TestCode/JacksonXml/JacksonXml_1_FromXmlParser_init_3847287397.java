package com.fasterxml.jackson.dataformat.xml.deser;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static com.fasterxml.jackson.dataformat.xml.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FromXmlParser_init_3847287397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13621;
     Object term13713;
     Object term13813;

    public FromXmlParser_init_3847287397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13325 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        Object term13417 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term13537 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setIntField(term13325, term13325.getClass(), "_features", 0);
        setField(term13325, term13325.getClass(), "_cfgNameForTextElement", null);
        setField(term13325, term13325.getClass(), "_byteArrayBuilder", null);
        setIntField(term13325, term13325.getClass(), "_formatFeatures", 0);
        setField(term13325, term13325.getClass(), "_ioContext", null);
        setField(term13325, term13325.getClass(), "_objectCodec", term13417);
        setField(term13325, term13325.getClass(), "_parsingContext", term13537);
        setField(term13325, term13325.getClass(), "_nextToken", null);
        term13621 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term13621, term13621.getClass(), "_sourceRef", null);
        term13713 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term13813 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2FilteredStreamReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[4] = Class.forName("javax.xml.stream.XMLStreamReader");
        Object[] args = new Object[5];
        args[0] = term13621;
        args[1] = 0;
        args[2] = 0;
        args[3] = term13713;
        args[4] = term13813;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
