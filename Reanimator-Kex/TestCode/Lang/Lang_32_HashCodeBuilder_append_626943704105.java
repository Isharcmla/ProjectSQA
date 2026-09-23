package org.apache.commons.lang3.builder;

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
import java.lang.reflect.InaccessibleObjectException;
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class HashCodeBuilder_append_626943704105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20477;
     Object term20101;

    public HashCodeBuilder_append_626943704105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20477 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term20477, term20477.getClass(), "iTotal", 0);
        setIntField(term20477, term20477.getClass(), "iConstant", 0);
        Class<? extends Object> term20495 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsChars$ByteBufferHandle");
        term20101 = (Object[]) newArray("java.lang.Object", 4);
        Object term20546 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        Object term20622 = newInstance(Class.forName("java.lang.module.ModuleDescriptor$1"));
        Object term20660 = newInstance(Class.forName("java.lang.Object"));
        setElement(term20101, 0, term20495);
        setElement(term20101, 1, term20546);
        setElement(term20101, 2, term20622);
        setElement(term20101, 3, term20660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term20101;
        try {
            callMethod(klass, "append", argTypes, term20477, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


