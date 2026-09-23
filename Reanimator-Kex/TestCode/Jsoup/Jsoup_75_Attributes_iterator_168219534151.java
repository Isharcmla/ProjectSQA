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
     Object term49746;
     Object term49740;

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
        term49746 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term49747 = (Object[]) newArray("java.lang.String", 0);
        Object[] term49748 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term49746, term49746.getClass(), "size", -2068769794);
        setField(term49746, term49746.getClass(), "keys", term49747);
        setField(term49746, term49746.getClass(), "vals", term49748);
        term49740 = newInstance(Class.forName("org.jsoup.nodes.Attributes$1"));
        Object term49742 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term49744 = (Object[]) newArray("java.lang.String", 0);
        Object[] term49745 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term49740, term49740.getClass(), "i", 0);
        setIntField(term49742, term49742.getClass(), "size", -2068769794);
        setField(term49742, term49742.getClass(), "keys", term49744);
        setField(term49742, term49742.getClass(), "vals", term49745);
        setField(term49740, term49740.getClass(), "this$0", term49742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "iterator", argTypes, term593, args);
        assertTrue(recursiveEquals(term593, term49746));
        assertTrue(recursiveEquals(retValue, term49740));
    }

};


