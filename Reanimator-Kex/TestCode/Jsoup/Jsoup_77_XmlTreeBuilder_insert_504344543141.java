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

public class XmlTreeBuilder_insert_504344543141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249791;
     Object term249923;

    public XmlTreeBuilder_insert_504344543141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249791 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term249857 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term249857, term249857.getClass(), "preserveTagCase", true);
        setField(term249791, term249791.getClass(), "settings", term249857);
        char[] term249593 = (char[]) newCharArray(0);
        StringBuilder term249983 = new StringBuilder();
        ((StringBuilder) term249983).append(term249593);
        char[] term249608 = (char[]) newCharArray(0);
        StringBuilder term250043 = new StringBuilder();
        ((StringBuilder) term250043).append(term249608);
        term249923 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term249923, term249923.getClass(), "name", term249983);
        setField(term249923, term249923.getClass(), "publicIdentifier", term249983);
        setField(term249923, term249923.getClass(), "systemIdentifier", term250043);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term249923;
        try {
            callMethod(klass, "insert", argTypes, term249791, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


