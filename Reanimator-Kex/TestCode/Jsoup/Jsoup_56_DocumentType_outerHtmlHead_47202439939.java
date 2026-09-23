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
import java.nio.ReadOnlyBufferException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DocumentType_outerHtmlHead_47202439939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21605;
     Object term21659;
     Object term21743;

    public DocumentType_outerHtmlHead_47202439939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21605 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        term21659 = newInstance(Class.forName("java.nio.HeapCharBufferR"));
        Class<? extends Object> term22393 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term22392 = ((Class) term22393).getDeclaredField((String) "xml");
        ((Field) term22392).setAccessible(true);
        Object enum31 = ((Field) term22392).get((Object) null);
        term21743 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term21743, term21743.getClass(), "syntax", enum31);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term21659;
        args[1] = 0;
        args[2] = term21743;
        try {
            callMethod(klass, "outerHtmlHead", argTypes, term21605, args);
            assertTrue(false);
        }
        catch (ReadOnlyBufferException e) {
        }

    }

};


