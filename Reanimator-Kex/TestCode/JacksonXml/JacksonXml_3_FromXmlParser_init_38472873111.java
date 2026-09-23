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

public class FromXmlParser_init_38472873111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24219;
     Object term24319;

    public FromXmlParser_init_38472873111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term23885 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        Object term24015 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term24135 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setIntField(term23885, term23885.getClass(), "_features", 0);
        setField(term23885, term23885.getClass(), "_cfgNameForTextElement", "");
        setField(term23885, term23885.getClass(), "_byteArrayBuilder", null);
        setIntField(term23885, term23885.getClass(), "_formatFeatures", 0);
        setField(term23885, term23885.getClass(), "_ioContext", null);
        setField(term23885, term23885.getClass(), "_objectCodec", term24015);
        setField(term23885, term23885.getClass(), "_parsingContext", term24135);
        setField(term23885, term23885.getClass(), "_nextToken", null);
        term24219 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        byte[] term23657 = (byte[]) newByteArray(0);
        setField(term24219, term24219.getClass(), "_sourceRef", term23657);
        term24319 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2FilteredStreamReader"));
        setField(term24319, term24319.getClass(), "reader", term24319);
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
        args[0] = term24219;
        args[1] = 0;
        args[2] = 0;
        args[3] = null;
        args[4] = term24319;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


