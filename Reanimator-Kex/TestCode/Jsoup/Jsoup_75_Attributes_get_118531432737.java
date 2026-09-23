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

public class Attributes_get_118531432737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194;
     Object term46632;

    public Attributes_get_118531432737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term196 = (Object[]) newArray("java.lang.String", 0);
        Object[] term197 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term194, term194.getClass(), "size", -616727354);
        setField(term194, term194.getClass(), "keys", term196);
        setField(term194, term194.getClass(), "vals", term197);
        term46632 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term46633 = (Object[]) newArray("java.lang.String", 0);
        Object[] term46634 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term46632, term46632.getClass(), "size", -616727354);
        setField(term46632, term46632.getClass(), "keys", term46633);
        setField(term46632, term46632.getClass(), "vals", term46634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hRNSzYYIrc";
        Object retValue = callMethod(klass, "get", argTypes, term194, args);
        assertTrue(recursiveEquals(term194, term46632));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


