package org.jsoup;

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
import java.lang.NoClassDefFoundError;
import static org.jsoup.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class Jsoup_clean_212357774630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term967;
     Object term990;

    public Jsoup_clean_212357774630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term969 = new HashMap();
        Set<Object> term9303 =  ((Map) term969).keySet();
        HashSet term968 = new HashSet((Collection<? extends Object>) term9303);
        HashMap term974 = new HashMap();
        HashMap term979 = new HashMap();
        HashMap term984 = new HashMap();
        term967 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term967, term967.getClass(), "tagNames", term968);
        setField(term967, term967.getClass(), "attributes", term974);
        setField(term967, term967.getClass(), "enforcedAttributes", term979);
        setField(term967, term967.getClass(), "protocols", term984);
        setBooleanField(term967, term967.getClass(), "preserveRelativeLinks", true);
        Class<? extends Object> term9305 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term9304 = ((Class) term9305).getDeclaredField((String) "html");
        ((Field) term9304).setAccessible(true);
        Object enum3 = ((Field) term9304).get((Object) null);
        term990 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term990, term990.getClass(), "escapeMode", null);
        setField(term990, term990.getClass(), "charset", null);
        setBooleanField(term990, term990.getClass(), "prettyPrint", true);
        setBooleanField(term990, term990.getClass(), "outline", false);
        setIntField(term990, term990.getClass(), "indentAmount", -2038273078);
        setField(term990, term990.getClass(), "syntax", enum3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.Jsoup");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.safety.Whitelist");
        argTypes[3] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[4];
        args[0] = "RkybSrpybU";
        args[1] = "xOEqzGAmDU";
        args[2] = term967;
        args[3] = term990;
        try {
            callMethod(klass, "clean", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


