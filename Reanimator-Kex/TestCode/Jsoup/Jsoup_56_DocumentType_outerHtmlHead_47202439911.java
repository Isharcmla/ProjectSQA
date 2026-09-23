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
import java.lang.String;
import java.lang.Object;

public class DocumentType_outerHtmlHead_47202439911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3230;
     Object term3314;

    public DocumentType_outerHtmlHead_47202439911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3230 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Class<? extends Object> term3962 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term3961 = ((Class) term3962).getDeclaredField((String) "xml");
        ((Field) term3961).setAccessible(true);
        Object enum7 = ((Field) term3961).get((Object) null);
        term3314 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term3314, term3314.getClass(), "syntax", enum7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = term3314;
        try {
            callMethod(klass, "outerHtmlHead", argTypes, term3230, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


