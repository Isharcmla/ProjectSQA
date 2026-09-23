package org.apache.commons.lang.text;

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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StrBuilder_replaceAll_1949998028422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309073;

    public StrBuilder_replaceAll_1949998028422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309073 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term291143 = (char[]) newCharArray(492);
        setIntField(term309073, term309073.getClass(), "size", 109);
        setCharElement(term291143, 28, (char) 2);
        setCharElement(term291143, 55, (char) 4096);
        setCharElement(term291143, 113, (char) 2);
        setCharElement(term291143, 126, (char) 1);
        setCharElement(term291143, 127, (char) 1);
        setCharElement(term291143, 128, (char) 1);
        setCharElement(term291143, 129, (char) 1);
        setCharElement(term291143, 130, (char) 1);
        setCharElement(term291143, 131, (char) 1);
        setCharElement(term291143, 132, (char) 1);
        setCharElement(term291143, 133, (char) 1);
        setCharElement(term291143, 134, (char) 1);
        setCharElement(term291143, 135, (char) 1);
        setCharElement(term291143, 136, (char) 1);
        setCharElement(term291143, 137, (char) 1);
        setCharElement(term291143, 138, (char) 1);
        setCharElement(term291143, 139, (char) 1);
        setCharElement(term291143, 140, (char) 1);
        setCharElement(term291143, 141, (char) 8192);
        setField(term309073, term309073.getClass(), "buffer", term291143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "                                                                                                             ";
        args[1] = "                            \u0002                                                                                    \u0002            \u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001                                                                                                                                                                                                                                                                                                                                                            ";
        callMethod(klass, "replaceAll", argTypes, term309073, args);
    }

};


