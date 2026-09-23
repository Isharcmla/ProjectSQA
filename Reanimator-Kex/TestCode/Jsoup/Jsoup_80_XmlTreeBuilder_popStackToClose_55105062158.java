package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class XmlTreeBuilder_popStackToClose_55105062158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198508;
     Object term198638;

    public XmlTreeBuilder_popStackToClose_55105062158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198508 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term198574 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term198574, term198574.getClass(), "preserveTagCase", true);
        setField(term198508, term198508.getClass(), "settings", term198574);
        term198638 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term198638, term198638.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term198638;
        try {
            callMethod(klass, "popStackToClose", argTypes, term198508, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


