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

public class HashCodeBuilder_append_626943704107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21959;
     Object term21585;

    public HashCodeBuilder_append_626943704107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21959 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term21959, term21959.getClass(), "iTotal", 0);
        setIntField(term21959, term21959.getClass(), "iConstant", 0);
        Class<? extends Object> term21996 = Class.forName((String) "java.nio.file.FileSystem");
        term21585 = (Object[]) newArray("java.lang.Object", 512);
        Object term21978 = newInstance(Class.forName("java.lang.Object"));
        Object term22116 = newInstance(Class.forName("java.util.stream.Nodes$EmptyNode$OfRef"));
        Object term22154 = newInstance(Class.forName("java.lang.Object"));
        setElement(term21585, 0, term21978);
        setElement(term21585, 1, term21996);
        setElement(term21585, 2, term22116);
        setElement(term21585, 16, term22154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term21585;
        try {
            callMethod(klass, "append", argTypes, term21959, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


