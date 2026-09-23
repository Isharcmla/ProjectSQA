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
import org.mockito.Mockito;

public class IteratorUtils_nodeListIterator_1590531432150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17318;
     Object term19080;

    public IteratorUtils_nodeListIterator_1590531432150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17318 = Mockito.mock(Class.forName("org.w3c.dom.Node"));
        term19080 = newInstance(Class.forName("org.apache.commons.collections4.iterators.NodeListIterator"));
        setField(term19080, term19080.getClass(), "nodeList", null);
        setIntField(term19080, term19080.getClass(), "index", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term17318;
        Object retValue = callMethod(klass, "nodeListIterator", argTypes, null, args);
        assertTrue(recursiveEquals(term17318, null));
        assertTrue(recursiveEquals(retValue, term19080));
    }

};


