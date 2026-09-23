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

public class Selector_combinator_382623539388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term714978;

    public Selector_combinator_382623539388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term714978 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term715038 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term715038, term715038.getClass(), "queue", "");
        setIntField(term715038, term715038.getClass(), "pos", 0);
        setField(term714978, term714978.getClass(), "tq", term715038);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = ">";
        try {
            callMethod(klass, "combinator", argTypes, term714978, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


