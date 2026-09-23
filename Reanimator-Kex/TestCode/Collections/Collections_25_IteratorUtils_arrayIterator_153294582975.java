package org.apache.commons.collections4;

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
import static org.apache.commons.collections4.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.EqualityUtils.*;
import java.lang.Object;

public class IteratorUtils_arrayIterator_153294582975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term214;
     Object term197;

    public IteratorUtils_arrayIterator_153294582975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = (Object[]) newArray("java.lang.Object", 9);
        Object term4 = newInstance(Class.forName("java.lang.Object"));
        Object term5 = newInstance(Class.forName("java.lang.Object"));
        Object term6 = newInstance(Class.forName("java.lang.Object"));
        Object term7 = newInstance(Class.forName("java.lang.Object"));
        Object term8 = newInstance(Class.forName("java.lang.Object"));
        Object term9 = newInstance(Class.forName("java.lang.Object"));
        Object term10 = newInstance(Class.forName("java.lang.Object"));
        Object term11 = newInstance(Class.forName("java.lang.Object"));
        Object term12 = newInstance(Class.forName("java.lang.Object"));
        setElement(term3, 0, term4);
        setElement(term3, 1, term5);
        setElement(term3, 2, term6);
        setElement(term3, 3, term7);
        setElement(term3, 4, term8);
        setElement(term3, 5, term9);
        setElement(term3, 6, term10);
        setElement(term3, 7, term11);
        setElement(term3, 8, term12);
        term214 = (Object[]) newArray("java.lang.Object", 9);
        Object term215 = newInstance(Class.forName("java.lang.Object"));
        Object term216 = newInstance(Class.forName("java.lang.Object"));
        Object term217 = newInstance(Class.forName("java.lang.Object"));
        Object term218 = newInstance(Class.forName("java.lang.Object"));
        Object term219 = newInstance(Class.forName("java.lang.Object"));
        Object term220 = newInstance(Class.forName("java.lang.Object"));
        Object term221 = newInstance(Class.forName("java.lang.Object"));
        Object term222 = newInstance(Class.forName("java.lang.Object"));
        Object term223 = newInstance(Class.forName("java.lang.Object"));
        setElement(term214, 0, term215);
        setElement(term214, 1, term216);
        setElement(term214, 2, term217);
        setElement(term214, 3, term218);
        setElement(term214, 4, term219);
        setElement(term214, 5, term220);
        setElement(term214, 6, term221);
        setElement(term214, 7, term222);
        setElement(term214, 8, term223);
        term197 = newInstance(Class.forName("org.apache.commons.collections4.iterators.ObjectArrayIterator"));
        Object[] term198 = (Object[]) newArray("java.lang.Object", 9);
        Object term199 = newInstance(Class.forName("java.lang.Object"));
        Object term200 = newInstance(Class.forName("java.lang.Object"));
        Object term201 = newInstance(Class.forName("java.lang.Object"));
        Object term202 = newInstance(Class.forName("java.lang.Object"));
        Object term203 = newInstance(Class.forName("java.lang.Object"));
        Object term204 = newInstance(Class.forName("java.lang.Object"));
        Object term205 = newInstance(Class.forName("java.lang.Object"));
        Object term206 = newInstance(Class.forName("java.lang.Object"));
        Object term207 = newInstance(Class.forName("java.lang.Object"));
        setElement(term198, 0, term199);
        setElement(term198, 1, term200);
        setElement(term198, 2, term201);
        setElement(term198, 3, term202);
        setElement(term198, 4, term203);
        setElement(term198, 5, term204);
        setElement(term198, 6, term205);
        setElement(term198, 7, term206);
        setElement(term198, 8, term207);
        setField(term197, term197.getClass(), "array", term198);
        setIntField(term197, term197.getClass(), "startIndex", 0);
        setIntField(term197, term197.getClass(), "endIndex", 9);
        setIntField(term197, term197.getClass(), "index", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3;
        Object retValue = callMethod(klass, "arrayIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term3, term214));
        assertTrue(recursiveEquals(retValue, term197));
    }

};


