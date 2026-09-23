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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Attributes_put_26521640543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418;
     Object term422;

    public Attributes_put_26521640543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term418 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term420 = (Object[]) newArray("java.lang.String", 0);
        Object[] term421 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term418, term418.getClass(), "size", -522618178);
        setField(term418, term418.getClass(), "keys", term420);
        setField(term418, term418.getClass(), "vals", term421);
        term422 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term447 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term449 = (Object[]) newArray("java.lang.String", 0);
        Object[] term450 = (Object[]) newArray("java.lang.String", 0);
        setField(term422, term422.getClass(), "key", "tbcdzjIfER");
        setField(term422, term422.getClass(), "val", "HyxfbSQYBe");
        setIntField(term447, term447.getClass(), "size", 1134449235);
        setField(term447, term447.getClass(), "keys", term449);
        setField(term447, term447.getClass(), "vals", term450);
        setField(term422, term422.getClass(), "parent", term447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attribute");
        Object[] args = new Object[1];
        args[0] = term422;
        try {
            callMethod(klass, "put", argTypes, term418, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


