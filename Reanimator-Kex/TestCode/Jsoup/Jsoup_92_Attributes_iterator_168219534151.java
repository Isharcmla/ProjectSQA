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

public class Attributes_iterator_168219534151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term593;
     Object term49771;
     Object term49765;

    public Attributes_iterator_168219534151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term593 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term595 = (Object[]) newArray("java.lang.String", 0);
        Object[] term596 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term593, term593.getClass(), "size", -2068769794);
        setField(term593, term593.getClass(), "keys", term595);
        setField(term593, term593.getClass(), "vals", term596);
        term49771 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term49772 = (Object[]) newArray("java.lang.String", 0);
        Object[] term49773 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term49771, term49771.getClass(), "size", -2068769794);
        setField(term49771, term49771.getClass(), "keys", term49772);
        setField(term49771, term49771.getClass(), "vals", term49773);
        term49765 = newInstance(Class.forName("org.jsoup.nodes.Attributes$1"));
        Object term49767 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term49769 = (Object[]) newArray("java.lang.String", 0);
        Object[] term49770 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term49765, term49765.getClass(), "i", 0);
        setIntField(term49767, term49767.getClass(), "size", -2068769794);
        setField(term49767, term49767.getClass(), "keys", term49769);
        setField(term49767, term49767.getClass(), "vals", term49770);
        setField(term49765, term49765.getClass(), "this$0", term49767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "iterator", argTypes, term593, args);
        assertTrue(recursiveEquals(term593, term49771));
        assertTrue(recursiveEquals(retValue, term49765));
    }

};


