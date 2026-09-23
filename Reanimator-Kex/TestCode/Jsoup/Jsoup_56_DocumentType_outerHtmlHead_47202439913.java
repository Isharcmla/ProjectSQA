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
import java.util.LinkedHashMap;
import java.lang.String;

public class DocumentType_outerHtmlHead_47202439913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4760;
     Object term5034;
     Object term5118;

    public DocumentType_outerHtmlHead_47202439913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term4878 = new LinkedHashMap();
        term4760 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term4818 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4818, term4818.getClass(), "attributes", term4878);
        setField(term4760, term4760.getClass(), "attributes", term4818);
        term5034 = newInstance(Class.forName("java.io.CharArrayWriter"));
        Class<? extends Object> term5931 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term5930 = ((Class) term5931).getDeclaredField((String) "html");
        ((Field) term5930).setAccessible(true);
        Object enum10 = ((Field) term5930).get((Object) null);
        term5118 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term5118, term5118.getClass(), "syntax", enum10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term5034;
        args[1] = 0;
        args[2] = term5118;
        try {
            callMethod(klass, "outerHtmlHead", argTypes, term4760, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


