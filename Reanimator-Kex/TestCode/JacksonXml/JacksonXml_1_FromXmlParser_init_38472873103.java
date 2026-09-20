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
import java.lang.StackOverflowError;
import static com.fasterxml.jackson.dataformat.xml.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FromXmlParser_init_38472873103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18637;
     Object term18737;

    public FromXmlParser_init_38472873103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18303 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        Object term18433 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term18553 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setIntField(term18303, term18303.getClass(), "_features", 0);
        setField(term18303, term18303.getClass(), "_cfgNameForTextElement", "");
        setField(term18303, term18303.getClass(), "_byteArrayBuilder", null);
        setIntField(term18303, term18303.getClass(), "_formatFeatures", 0);
        setField(term18303, term18303.getClass(), "_ioContext", null);
        setField(term18303, term18303.getClass(), "_objectCodec", term18433);
        setField(term18303, term18303.getClass(), "_parsingContext", term18553);
        setField(term18303, term18303.getClass(), "_nextToken", null);
        term18637 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        byte[] term18075 = (byte[]) newByteArray(0);
        setField(term18637, term18637.getClass(), "_sourceRef", term18075);
        term18737 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2FilteredStreamReader"));
        setField(term18737, term18737.getClass(), "reader", term18737);
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
        args[0] = term18637;
        args[1] = 0;
        args[2] = 0;
        args[3] = null;
        args[4] = term18737;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};
