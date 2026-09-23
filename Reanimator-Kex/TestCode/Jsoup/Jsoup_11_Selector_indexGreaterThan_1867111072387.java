package org.jsoup.select;

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
import java.lang.IllegalArgumentException;
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Selector_indexGreaterThan_1867111072387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term714753;

    public Selector_indexGreaterThan_1867111072387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term714753 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term714813 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term714753, term714753.getClass(), "root", null);
        setField(term714813, term714813.getClass(), "queue", "");
        setIntField(term714813, term714813.getClass(), "pos", 0);
        setField(term714753, term714753.getClass(), "tq", term714813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "indexGreaterThan", argTypes, term714753, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


