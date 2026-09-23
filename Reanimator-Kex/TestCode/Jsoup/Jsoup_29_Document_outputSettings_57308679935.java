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

public class Document_outputSettings_57308679935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4685;
     Object term4766;
     Object term17597;
     Object term17613;
     Object term17518;

    public Document_outputSettings_57308679935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17615 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term17614 = ((Class) term17615).getDeclaredField((String) "limitedQuirks");
        ((Field) term17614).setAccessible(true);
        Object enum43 = ((Field) term17614).get((Object) null);
        HashMap term4727 = new HashMap();
        Set<Object> term19739 =  ((Map) term4727).keySet();
        HashSet term4726 = new HashSet((Collection<? extends Object>) term19739);
        ArrayList term4737 = new ArrayList();
        ((ArrayList) term4737).add((Object)null);
        ((ArrayList) term4737).add((Object)null);
        ((ArrayList) term4737).add((Object)null);
        ((ArrayList) term4737).add((Object)null);
        ((ArrayList) term4737).add((Object)null);
        LinkedHashMap term4742 = new LinkedHashMap();
        term4685 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term4686 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term4706 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4741 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4686, term4686.getClass(), "escapeMode", null);
        setField(term4686, term4686.getClass(), "charset", null);
        setField(term4686, term4686.getClass(), "charsetEncoder", null);
        setBooleanField(term4686, term4686.getClass(), "prettyPrint", true);
        setIntField(term4686, term4686.getClass(), "indentAmount", -203030934);
        setField(term4685, term4685.getClass(), "outputSettings", term4686);
        setField(term4685, term4685.getClass(), "quirksMode", enum43);
        setField(term4706, term4706.getClass(), "tagName", "aWYOWZFyaX");
        setBooleanField(term4706, term4706.getClass(), "isBlock", false);
        setBooleanField(term4706, term4706.getClass(), "formatAsBlock", false);
        setBooleanField(term4706, term4706.getClass(), "canContainBlock", true);
        setBooleanField(term4706, term4706.getClass(), "canContainInline", true);
        setBooleanField(term4706, term4706.getClass(), "empty", false);
        setBooleanField(term4706, term4706.getClass(), "selfClosing", false);
        setBooleanField(term4706, term4706.getClass(), "preserveWhitespace", true);
        setField(term4685, term4685.getClass(), "tag", term4706);
        setField(term4685, term4685.getClass(), "classNames", term4726);
        setField(term4685, term4685.getClass(), "parentNode", null);
        setField(term4685, term4685.getClass(), "childNodes", term4737);
        setField(term4741, term4741.getClass(), "attributes", term4742);
        setField(term4685, term4685.getClass(), "attributes", term4741);
        setField(term4685, term4685.getClass(), "baseUri", "XYtryyobou");
        setIntField(term4685, term4685.getClass(), "siblingIndex", -1179120542);
        term4766 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term4766, term4766.getClass(), "escapeMode", null);
        setField(term4766, term4766.getClass(), "charset", null);
        setField(term4766, term4766.getClass(), "charsetEncoder", null);
        setBooleanField(term4766, term4766.getClass(), "prettyPrint", false);
        setIntField(term4766, term4766.getClass(), "indentAmount", -73683645);
        Class<? extends Object> term19751 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term19750 = ((Class) term19751).getDeclaredField((String) "limitedQuirks");
        ((Field) term19750).setAccessible(true);
        Object enum52 = ((Field) term19750).get((Object) null);
        HashMap term17606 = new HashMap();
        Set<Object> term19981 =  ((Map) term17606).keySet();
        HashSet term17605 = new HashSet((Collection<? extends Object>) term19981);
        ArrayList term17607 = new ArrayList();
        ((ArrayList) term17607).add((Object)null);
        ((ArrayList) term17607).add((Object)null);
        ((ArrayList) term17607).add((Object)null);
        ((ArrayList) term17607).add((Object)null);
        ((ArrayList) term17607).add((Object)null);
        LinkedHashMap term17610 = new LinkedHashMap();
        term17597 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term17598 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term17602 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term17609 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term17598, term17598.getClass(), "escapeMode", null);
        setField(term17598, term17598.getClass(), "charset", null);
        setField(term17598, term17598.getClass(), "charsetEncoder", null);
        setBooleanField(term17598, term17598.getClass(), "prettyPrint", false);
        setIntField(term17598, term17598.getClass(), "indentAmount", -73683645);
        setField(term17597, term17597.getClass(), "outputSettings", term17598);
        setField(term17597, term17597.getClass(), "quirksMode", enum52);
        setField(term17602, term17602.getClass(), "tagName", "aWYOWZFyaX");
        setBooleanField(term17602, term17602.getClass(), "isBlock", false);
        setBooleanField(term17602, term17602.getClass(), "formatAsBlock", false);
        setBooleanField(term17602, term17602.getClass(), "canContainBlock", true);
        setBooleanField(term17602, term17602.getClass(), "canContainInline", true);
        setBooleanField(term17602, term17602.getClass(), "empty", false);
        setBooleanField(term17602, term17602.getClass(), "selfClosing", false);
        setBooleanField(term17602, term17602.getClass(), "preserveWhitespace", true);
        setField(term17597, term17597.getClass(), "tag", term17602);
        setField(term17597, term17597.getClass(), "classNames", term17605);
        setField(term17597, term17597.getClass(), "parentNode", null);
        setField(term17597, term17597.getClass(), "childNodes", term17607);
        setField(term17609, term17609.getClass(), "attributes", term17610);
        setField(term17597, term17597.getClass(), "attributes", term17609);
        setField(term17597, term17597.getClass(), "baseUri", "XYtryyobou");
        setIntField(term17597, term17597.getClass(), "siblingIndex", -1179120542);
        term17613 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term17613, term17613.getClass(), "escapeMode", null);
        setField(term17613, term17613.getClass(), "charset", null);
        setField(term17613, term17613.getClass(), "charsetEncoder", null);
        setBooleanField(term17613, term17613.getClass(), "prettyPrint", false);
        setIntField(term17613, term17613.getClass(), "indentAmount", -73683645);
        Class<? extends Object> term19993 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term19992 = ((Class) term19993).getDeclaredField((String) "limitedQuirks");
        ((Field) term19992).setAccessible(true);
        Object enum53 = ((Field) term19992).get((Object) null);
        HashMap term17568 = new HashMap();
        Set<Object> term20223 =  ((Map) term17568).keySet();
        HashSet term17567 = new HashSet((Collection<? extends Object>) term20223);
        ArrayList term17573 = new ArrayList();
        ((ArrayList) term17573).add((Object)null);
        ((ArrayList) term17573).add((Object)null);
        ((ArrayList) term17573).add((Object)null);
        ((ArrayList) term17573).add((Object)null);
        ((ArrayList) term17573).add((Object)null);
        LinkedHashMap term17578 = new LinkedHashMap();
        term17518 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term17289 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term17537 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term17577 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term17289, term17289.getClass(), "escapeMode", null);
        setField(term17289, term17289.getClass(), "charset", null);
        setField(term17289, term17289.getClass(), "charsetEncoder", null);
        setBooleanField(term17289, term17289.getClass(), "prettyPrint", false);
        setIntField(term17289, term17289.getClass(), "indentAmount", -73683645);
        setField(term17518, term17518.getClass(), "outputSettings", term17289);
        setField(term17518, term17518.getClass(), "quirksMode", enum53);
        setField(term17537, term17537.getClass(), "tagName", "aWYOWZFyaX");
        setBooleanField(term17537, term17537.getClass(), "isBlock", false);
        setBooleanField(term17537, term17537.getClass(), "formatAsBlock", false);
        setBooleanField(term17537, term17537.getClass(), "canContainBlock", true);
        setBooleanField(term17537, term17537.getClass(), "canContainInline", true);
        setBooleanField(term17537, term17537.getClass(), "empty", false);
        setBooleanField(term17537, term17537.getClass(), "selfClosing", false);
        setBooleanField(term17537, term17537.getClass(), "preserveWhitespace", true);
        setField(term17518, term17518.getClass(), "tag", term17537);
        setField(term17518, term17518.getClass(), "classNames", term17567);
        setField(term17518, term17518.getClass(), "parentNode", null);
        setField(term17518, term17518.getClass(), "childNodes", term17573);
        setField(term17577, term17577.getClass(), "attributes", term17578);
        setField(term17518, term17518.getClass(), "attributes", term17577);
        setField(term17518, term17518.getClass(), "baseUri", "XYtryyobou");
        setIntField(term17518, term17518.getClass(), "siblingIndex", -1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[1];
        args[0] = term4766;
        Object retValue = callMethod(klass, "outputSettings", argTypes, term4685, args);
        assertTrue(recursiveEquals(term4685, term17597));
        assertTrue(recursiveEquals(term4766, term17613));
        assertTrue(recursiveEquals(retValue, term17518));
    }

};


