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

public class Attribute_shouldCollapseAttribute_77820687859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138087;
     Object term138247;
     Object term138670;
     Object term138675;

    public Attribute_shouldCollapseAttribute_77820687859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138087 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term138087, term138087.getClass(), "key", "");
        setField(term138087, term138087.getClass(), "val", "");
        Class<? extends Object> term138680 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term138679 = ((Class) term138680).getDeclaredField((String) "html");
        ((Field) term138679).setAccessible(true);
        Object enum34 = ((Field) term138679).get((Object) null);
        term138247 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term138247, term138247.getClass(), "syntax", enum34);
        term138670 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term138670, term138670.getClass(), "key", "");
        setField(term138670, term138670.getClass(), "val", "");
        setField(term138670, term138670.getClass(), "parent", null);
        Class<? extends Object> term138929 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term138928 = ((Class) term138929).getDeclaredField((String) "html");
        ((Field) term138928).setAccessible(true);
        Object enum35 = ((Field) term138928).get((Object) null);
        term138675 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term138675, term138675.getClass(), "escapeMode", null);
        setField(term138675, term138675.getClass(), "charset", null);
        setField(term138675, term138675.getClass(), "encoderThreadLocal", null);
        setField(term138675, term138675.getClass(), "coreCharset", null);
        setBooleanField(term138675, term138675.getClass(), "prettyPrint", false);
        setBooleanField(term138675, term138675.getClass(), "outline", false);
        setIntField(term138675, term138675.getClass(), "indentAmount", 0);
        setField(term138675, term138675.getClass(), "syntax", enum35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[1];
        args[0] = term138247;
        callMethod(klass, "shouldCollapseAttribute", argTypes, term138087, args);
        assertTrue(recursiveEquals(term138087, term138670));
        assertTrue(recursiveEquals(term138247, term138675));
    }

};


