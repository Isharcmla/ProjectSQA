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

public class Attributes_getIgnoreCase_2456008538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220;
     Object term46679;

    public Attributes_getIgnoreCase_2456008538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term222 = (Object[]) newArray("java.lang.String", 0);
        Object[] term223 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term220, term220.getClass(), "size", -1955890973);
        setField(term220, term220.getClass(), "keys", term222);
        setField(term220, term220.getClass(), "vals", term223);
        term46679 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term46680 = (Object[]) newArray("java.lang.String", 0);
        Object[] term46681 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term46679, term46679.getClass(), "size", -1955890973);
        setField(term46679, term46679.getClass(), "keys", term46680);
        setField(term46679, term46679.getClass(), "vals", term46681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RMFIsYGgne";
        Object retValue = callMethod(klass, "getIgnoreCase", argTypes, term220, args);
        assertTrue(recursiveEquals(term220, term46679));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


