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
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Document_nodeName_1582854332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3762;
     Object term15989;

    public Document_nodeName_1582854332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16017 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term16016 = ((Class) term16017).getDeclaredField((String) "noQuirks");
        ((Field) term16016).setAccessible(true);
        Object enum38 = ((Field) term16016).get((Object) null);
        HashMap term3799 = new HashMap();
        Set<Object> term16232 =  ((Map) term3799).keySet();
        HashSet term3798 = new HashSet((Collection<? extends Object>) term16232);
        ArrayList term3815 = new ArrayList();
        ((ArrayList) term3815).add((Object)null);
        ((ArrayList) term3815).add((Object)null);
        ((ArrayList) term3815).add((Object)null);
        LinkedHashMap term3820 = new LinkedHashMap();
        term3762 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term3763 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term3778 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3819 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3763, term3763.getClass(), "escapeMode", null);
        setField(term3763, term3763.getClass(), "charset", null);
        setField(term3763, term3763.getClass(), "charsetEncoder", null);
        setBooleanField(term3763, term3763.getClass(), "prettyPrint", false);
        setIntField(term3763, term3763.getClass(), "indentAmount", -1007160944);
        setField(term3762, term3762.getClass(), "outputSettings", term3763);
        setField(term3762, term3762.getClass(), "quirksMode", enum38);
        setField(term3778, term3778.getClass(), "tagName", "xIeFjkHkOe");
        setBooleanField(term3778, term3778.getClass(), "isBlock", false);
        setBooleanField(term3778, term3778.getClass(), "formatAsBlock", true);
        setBooleanField(term3778, term3778.getClass(), "canContainBlock", true);
        setBooleanField(term3778, term3778.getClass(), "canContainInline", true);
        setBooleanField(term3778, term3778.getClass(), "empty", false);
        setBooleanField(term3778, term3778.getClass(), "selfClosing", true);
        setBooleanField(term3778, term3778.getClass(), "preserveWhitespace", true);
        setField(term3762, term3762.getClass(), "tag", term3778);
        setField(term3762, term3762.getClass(), "classNames", term3798);
        setField(term3762, term3762.getClass(), "parentNode", null);
        setField(term3762, term3762.getClass(), "childNodes", term3815);
        setField(term3819, term3819.getClass(), "attributes", term3820);
        setField(term3762, term3762.getClass(), "attributes", term3819);
        setField(term3762, term3762.getClass(), "baseUri", "VMeAzAHwZj");
        setIntField(term3762, term3762.getClass(), "siblingIndex", 1135664017);
        Class<? extends Object> term16244 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term16243 = ((Class) term16244).getDeclaredField((String) "noQuirks");
        ((Field) term16243).setAccessible(true);
        Object enum39 = ((Field) term16243).get((Object) null);
        HashMap term15998 = new HashMap();
        Set<Object> term16459 =  ((Map) term15998).keySet();
        HashSet term15997 = new HashSet((Collection<? extends Object>) term16459);
        ArrayList term15999 = new ArrayList();
        ((ArrayList) term15999).add((Object)null);
        ((ArrayList) term15999).add((Object)null);
        ((ArrayList) term15999).add((Object)null);
        LinkedHashMap term16002 = new LinkedHashMap();
        term15989 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term15990 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term15994 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term16001 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term15990, term15990.getClass(), "escapeMode", null);
        setField(term15990, term15990.getClass(), "charset", null);
        setField(term15990, term15990.getClass(), "charsetEncoder", null);
        setBooleanField(term15990, term15990.getClass(), "prettyPrint", false);
        setIntField(term15990, term15990.getClass(), "indentAmount", -1007160944);
        setField(term15989, term15989.getClass(), "outputSettings", term15990);
        setField(term15989, term15989.getClass(), "quirksMode", enum39);
        setField(term15994, term15994.getClass(), "tagName", "xIeFjkHkOe");
        setBooleanField(term15994, term15994.getClass(), "isBlock", false);
        setBooleanField(term15994, term15994.getClass(), "formatAsBlock", true);
        setBooleanField(term15994, term15994.getClass(), "canContainBlock", true);
        setBooleanField(term15994, term15994.getClass(), "canContainInline", true);
        setBooleanField(term15994, term15994.getClass(), "empty", false);
        setBooleanField(term15994, term15994.getClass(), "selfClosing", true);
        setBooleanField(term15994, term15994.getClass(), "preserveWhitespace", true);
        setField(term15989, term15989.getClass(), "tag", term15994);
        setField(term15989, term15989.getClass(), "classNames", term15997);
        setField(term15989, term15989.getClass(), "parentNode", null);
        setField(term15989, term15989.getClass(), "childNodes", term15999);
        setField(term16001, term16001.getClass(), "attributes", term16002);
        setField(term15989, term15989.getClass(), "attributes", term16001);
        setField(term15989, term15989.getClass(), "baseUri", "VMeAzAHwZj");
        setIntField(term15989, term15989.getClass(), "siblingIndex", 1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nodeName", argTypes, term3762, args);
        assertTrue(recursiveEquals(term3762, term15989));
        assertTrue(recursiveEquals(retValue, "#document"));
    }

};


