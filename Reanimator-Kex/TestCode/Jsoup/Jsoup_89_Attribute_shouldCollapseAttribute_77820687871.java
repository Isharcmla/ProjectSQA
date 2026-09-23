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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class Attribute_shouldCollapseAttribute_77820687871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143472;
     Object term143632;
     Object term144055;
     Object term144060;

    public Attribute_shouldCollapseAttribute_77820687871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143472 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term143472, term143472.getClass(), "key", "");
        setField(term143472, term143472.getClass(), "val", "");
        Class<? extends Object> term144065 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term144064 = ((Class) term144065).getDeclaredField((String) "html");
        ((Field) term144064).setAccessible(true);
        Object enum43 = ((Field) term144064).get((Object) null);
        term143632 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term143632, term143632.getClass(), "syntax", enum43);
        term144055 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term144055, term144055.getClass(), "key", "");
        setField(term144055, term144055.getClass(), "val", "");
        setField(term144055, term144055.getClass(), "parent", null);
        Class<? extends Object> term144314 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term144313 = ((Class) term144314).getDeclaredField((String) "html");
        ((Field) term144313).setAccessible(true);
        Object enum44 = ((Field) term144313).get((Object) null);
        term144060 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term144060, term144060.getClass(), "escapeMode", null);
        setField(term144060, term144060.getClass(), "charset", null);
        setField(term144060, term144060.getClass(), "encoderThreadLocal", null);
        setField(term144060, term144060.getClass(), "coreCharset", null);
        setBooleanField(term144060, term144060.getClass(), "prettyPrint", false);
        setBooleanField(term144060, term144060.getClass(), "outline", false);
        setIntField(term144060, term144060.getClass(), "indentAmount", 0);
        setField(term144060, term144060.getClass(), "syntax", enum44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[1];
        args[0] = term143632;
        callMethod(klass, "shouldCollapseAttribute", argTypes, term143472, args);
        assertTrue(recursiveEquals(term143472, term144055));
        assertTrue(recursiveEquals(term143632, term144060));
    }

};


