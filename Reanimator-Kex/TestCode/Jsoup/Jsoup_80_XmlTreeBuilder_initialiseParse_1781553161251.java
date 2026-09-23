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

public class XmlTreeBuilder_initialiseParse_1781553161251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308270;
     Object term308322;

    public XmlTreeBuilder_initialiseParse_1781553161251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term308270 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        term308322 = newInstance(Class.forName("java.io.CharArrayReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.Reader");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.parser.ParseErrorList");
        argTypes[3] = Class.forName("org.jsoup.parser.ParseSettings");
        Object[] args = new Object[4];
        args[0] = term308322;
        args[1] = "";
        args[2] = null;
        args[3] = null;
        try {
            callMethod(klass, "initialiseParse", argTypes, term308270, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


