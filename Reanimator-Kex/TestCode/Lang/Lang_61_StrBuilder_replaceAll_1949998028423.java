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
import static org.apache.commons.lang.text.EqualityUtils.*;

public class StrBuilder_replaceAll_1949998028423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309073;
     Object term312499;
     Object term311400;

    public StrBuilder_replaceAll_1949998028423() {
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
        term312499 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term312500 = (char[]) newCharArray(492);
        setCharElement(term312500, 28, (char) 2);
        setCharElement(term312500, 55, (char) 4096);
        setCharElement(term312500, 113, (char) 2);
        setCharElement(term312500, 126, (char) 1);
        setCharElement(term312500, 127, (char) 1);
        setCharElement(term312500, 128, (char) 1);
        setCharElement(term312500, 129, (char) 1);
        setCharElement(term312500, 130, (char) 1);
        setCharElement(term312500, 131, (char) 1);
        setCharElement(term312500, 132, (char) 1);
        setCharElement(term312500, 133, (char) 1);
        setCharElement(term312500, 134, (char) 1);
        setCharElement(term312500, 135, (char) 1);
        setCharElement(term312500, 136, (char) 1);
        setCharElement(term312500, 137, (char) 1);
        setCharElement(term312500, 138, (char) 1);
        setCharElement(term312500, 139, (char) 1);
        setCharElement(term312500, 140, (char) 1);
        setCharElement(term312500, 141, (char) 8192);
        setField(term312499, term312499.getClass(), "buffer", term312500);
        setIntField(term312499, term312499.getClass(), "size", 109);
        setField(term312499, term312499.getClass(), "newLine", null);
        setField(term312499, term312499.getClass(), "nullText", null);
        term311400 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term311401 = (char[]) newCharArray(492);
        setCharElement(term311401, 28, (char) 2);
        setCharElement(term311401, 55, (char) 4096);
        setCharElement(term311401, 113, (char) 2);
        setCharElement(term311401, 126, (char) 1);
        setCharElement(term311401, 127, (char) 1);
        setCharElement(term311401, 128, (char) 1);
        setCharElement(term311401, 129, (char) 1);
        setCharElement(term311401, 130, (char) 1);
        setCharElement(term311401, 131, (char) 1);
        setCharElement(term311401, 132, (char) 1);
        setCharElement(term311401, 133, (char) 1);
        setCharElement(term311401, 134, (char) 1);
        setCharElement(term311401, 135, (char) 1);
        setCharElement(term311401, 136, (char) 1);
        setCharElement(term311401, 137, (char) 1);
        setCharElement(term311401, 138, (char) 1);
        setCharElement(term311401, 139, (char) 1);
        setCharElement(term311401, 140, (char) 1);
        setCharElement(term311401, 141, (char) 8192);
        setField(term311400, term311400.getClass(), "buffer", term311401);
        setIntField(term311400, term311400.getClass(), "size", 109);
        setField(term311400, term311400.getClass(), "newLine", null);
        setField(term311400, term311400.getClass(), "nullText", null);
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
        Object retValue = callMethod(klass, "replaceAll", argTypes, term309073, args);
        assertTrue(recursiveEquals(term309073, term312499));
        assertTrue(recursiveEquals(retValue, term311400));
    }

};


