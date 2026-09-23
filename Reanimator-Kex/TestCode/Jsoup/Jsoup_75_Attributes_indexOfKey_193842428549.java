package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;

public class Attributes_indexOfKey_193842428549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14376174;
     Object term14376450;

    public Attributes_indexOfKey_193842428549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14376174 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14374443 = (Object[]) newArray("java.lang.String", 46);
        setIntField(term14376174, term14376174.getClass(), "size", 11);
        setElement(term14374443, 0, " ");
        setElement(term14374443, 2, "        ");
        setElement(term14374443, 5, "");
        setElement(term14374443, 6, "");
        setElement(term14374443, 7, "");
        setElement(term14374443, 8, "");
        setElement(term14374443, 9, "");
        setElement(term14374443, 10, "");
        setElement(term14374443, 11, "");
        setElement(term14374443, 12, "");
        setElement(term14374443, 13, "");
        setElement(term14374443, 14, "");
        setElement(term14374443, 15, "");
        setElement(term14374443, 16, "");
        setElement(term14374443, 17, "");
        setElement(term14374443, 18, "");
        setElement(term14374443, 19, "");
        setElement(term14374443, 20, "");
        setElement(term14374443, 21, "");
        setElement(term14374443, 22, "");
        setElement(term14374443, 23, "");
        setElement(term14374443, 24, "");
        setElement(term14374443, 25, "");
        setElement(term14374443, 26, "");
        setElement(term14374443, 27, "");
        setElement(term14374443, 28, "");
        setElement(term14374443, 29, "");
        setElement(term14374443, 30, "");
        setElement(term14374443, 31, "");
        setElement(term14374443, 32, "");
        setElement(term14374443, 33, "");
        setElement(term14374443, 34, "");
        setElement(term14374443, 35, "");
        setElement(term14374443, 36, "");
        setElement(term14374443, 37, "");
        setElement(term14374443, 38, "");
        setElement(term14374443, 39, "");
        setElement(term14374443, 40, "");
        setElement(term14374443, 41, "");
        setElement(term14374443, 42, "");
        setElement(term14374443, 43, "");
        setElement(term14374443, 44, "");
        setElement(term14374443, 45, "");
        setField(term14376174, term14376174.getClass(), "keys", term14374443);
        term14376450 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14376451 = (Object[]) newArray("java.lang.String", 46);
        setIntField(term14376450, term14376450.getClass(), "size", 11);
        setElement(term14376451, 0, " ");
        setElement(term14376451, 2, "        ");
        setElement(term14376451, 5, "");
        setElement(term14376451, 6, "");
        setElement(term14376451, 7, "");
        setElement(term14376451, 8, "");
        setElement(term14376451, 9, "");
        setElement(term14376451, 10, "");
        setElement(term14376451, 11, "");
        setElement(term14376451, 12, "");
        setElement(term14376451, 13, "");
        setElement(term14376451, 14, "");
        setElement(term14376451, 15, "");
        setElement(term14376451, 16, "");
        setElement(term14376451, 17, "");
        setElement(term14376451, 18, "");
        setElement(term14376451, 19, "");
        setElement(term14376451, 20, "");
        setElement(term14376451, 21, "");
        setElement(term14376451, 22, "");
        setElement(term14376451, 23, "");
        setElement(term14376451, 24, "");
        setElement(term14376451, 25, "");
        setElement(term14376451, 26, "");
        setElement(term14376451, 27, "");
        setElement(term14376451, 28, "");
        setElement(term14376451, 29, "");
        setElement(term14376451, 30, "");
        setElement(term14376451, 31, "");
        setElement(term14376451, 32, "");
        setElement(term14376451, 33, "");
        setElement(term14376451, 34, "");
        setElement(term14376451, 35, "");
        setElement(term14376451, 36, "");
        setElement(term14376451, 37, "");
        setElement(term14376451, 38, "");
        setElement(term14376451, 39, "");
        setElement(term14376451, 40, "");
        setElement(term14376451, 41, "");
        setElement(term14376451, 42, "");
        setElement(term14376451, 43, "");
        setElement(term14376451, 44, "");
        setElement(term14376451, 45, "");
        setField(term14376450, term14376450.getClass(), "keys", term14376451);
        setField(term14376450, term14376450.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "indexOfKey", argTypes, term14376174, args);
        assertTrue(recursiveEquals(term14376174, term14376450));
        assertTrue(recursiveEquals(retValue, 5));
    }

};


