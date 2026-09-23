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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FormElement_equals_817636276125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54035;
     Object term54169;

    public FormElement_equals_817636276125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54035 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term54198 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term54139 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term54035, term54035.getClass(), "childNodes", null);
        setField(term54035, term54035.getClass(), "attributes", term54198);
        setField(term54035, term54035.getClass(), "tag", term54139);
        term54169 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term54244 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term54169, term54169.getClass(), "childNodes", null);
        setField(term54169, term54169.getClass(), "attributes", term54198);
        setField(term54169, term54169.getClass(), "tag", term54244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term54169;
        try {
            callMethod(klass, "equals", argTypes, term54035, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


