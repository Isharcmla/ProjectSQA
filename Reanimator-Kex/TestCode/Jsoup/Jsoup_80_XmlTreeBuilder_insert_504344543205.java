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

public class XmlTreeBuilder_insert_504344543205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279556;
     Object term279688;

    public XmlTreeBuilder_insert_504344543205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279556 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term279622 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term279622, term279622.getClass(), "preserveTagCase", false);
        setField(term279556, term279556.getClass(), "settings", term279622);
        StringBuilder term279748 = new StringBuilder();
        StringBuilder term279808 = new StringBuilder();
        StringBuilder term279868 = new StringBuilder();
        term279688 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term279688, term279688.getClass(), "name", term279748);
        setField(term279688, term279688.getClass(), "publicIdentifier", term279808);
        setField(term279688, term279688.getClass(), "systemIdentifier", term279868);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term279688;
        try {
            callMethod(klass, "insert", argTypes, term279556, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


