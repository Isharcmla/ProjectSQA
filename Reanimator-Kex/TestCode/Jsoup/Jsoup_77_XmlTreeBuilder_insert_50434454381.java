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
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_50434454381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213675;
     Object term213807;

    public XmlTreeBuilder_insert_50434454381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213675 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term213741 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term213741, term213741.getClass(), "preserveTagCase", true);
        setField(term213675, term213675.getClass(), "settings", term213741);
        char[] term213393 = (char[]) newCharArray(41);
        StringBuilder term213867 = new StringBuilder();
        ((StringBuilder) term213867).append(term213393);
        term213807 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term213807, term213807.getClass(), "name", term213867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term213807;
        try {
            callMethod(klass, "insert", argTypes, term213675, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


