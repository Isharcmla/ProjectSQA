package org.jsoup.safety;

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
import static org.jsoup.safety.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.safety.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Cleaner_copySafeNodes_15577442528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1289;
     Object term1313;
     Object term1365;
     Object term5496;
     Object term5503;
     Object term5513;

    public Cleaner_copySafeNodes_15577442528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1292 = new HashMap();
        Set<Object> term5523 =  ((Map) term1292).keySet();
        HashSet term1291 = new HashSet((Collection<? extends Object>) term5523);
        HashMap term1297 = new HashMap();
        HashMap term1302 = new HashMap();
        HashMap term1307 = new HashMap();
        term1289 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        Object term1290 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term1290, term1290.getClass(), "tagNames", term1291);
        setField(term1290, term1290.getClass(), "attributes", term1297);
        setField(term1290, term1290.getClass(), "enforcedAttributes", term1302);
        setField(term1290, term1290.getClass(), "protocols", term1307);
        setBooleanField(term1290, term1290.getClass(), "preserveRelativeLinks", false);
        setField(term1289, term1289.getClass(), "whitelist", term1290);
        ArrayList term1336 = new ArrayList();
        ((ArrayList) term1336).add((Object)null);
        ((ArrayList) term1336).add((Object)null);
        ((ArrayList) term1336).add((Object)null);
        LinkedHashMap term1341 = new LinkedHashMap();
        term1313 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1314 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1340 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1314, term1314.getClass(), "tagName", "MxlszYVzRf");
        setBooleanField(term1314, term1314.getClass(), "isBlock", true);
        setBooleanField(term1314, term1314.getClass(), "formatAsBlock", true);
        setBooleanField(term1314, term1314.getClass(), "canContainBlock", true);
        setBooleanField(term1314, term1314.getClass(), "canContainInline", true);
        setBooleanField(term1314, term1314.getClass(), "empty", true);
        setBooleanField(term1314, term1314.getClass(), "selfClosing", true);
        setBooleanField(term1314, term1314.getClass(), "preserveWhitespace", false);
        setBooleanField(term1314, term1314.getClass(), "formList", true);
        setBooleanField(term1314, term1314.getClass(), "formSubmit", true);
        setField(term1313, term1313.getClass(), "tag", term1314);
        setField(term1313, term1313.getClass(), "parentNode", null);
        setField(term1313, term1313.getClass(), "childNodes", term1336);
        setField(term1340, term1340.getClass(), "attributes", term1341);
        setField(term1313, term1313.getClass(), "attributes", term1340);
        setField(term1313, term1313.getClass(), "baseUri", "ZiaGIbnzTs");
        setIntField(term1313, term1313.getClass(), "siblingIndex", -1922583790);
        ArrayList term1388 = new ArrayList();
        ((ArrayList) term1388).add((Object)null);
        ((ArrayList) term1388).add((Object)null);
        ((ArrayList) term1388).add((Object)null);
        ((ArrayList) term1388).add((Object)null);
        LinkedHashMap term1393 = new LinkedHashMap();
        term1365 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1366 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1392 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1366, term1366.getClass(), "tagName", "tbcdzjIfER");
        setBooleanField(term1366, term1366.getClass(), "isBlock", true);
        setBooleanField(term1366, term1366.getClass(), "formatAsBlock", true);
        setBooleanField(term1366, term1366.getClass(), "canContainBlock", false);
        setBooleanField(term1366, term1366.getClass(), "canContainInline", false);
        setBooleanField(term1366, term1366.getClass(), "empty", false);
        setBooleanField(term1366, term1366.getClass(), "selfClosing", true);
        setBooleanField(term1366, term1366.getClass(), "preserveWhitespace", true);
        setBooleanField(term1366, term1366.getClass(), "formList", false);
        setBooleanField(term1366, term1366.getClass(), "formSubmit", true);
        setField(term1365, term1365.getClass(), "tag", term1366);
        setField(term1365, term1365.getClass(), "parentNode", null);
        setField(term1365, term1365.getClass(), "childNodes", term1388);
        setField(term1392, term1392.getClass(), "attributes", term1393);
        setField(term1365, term1365.getClass(), "attributes", term1392);
        setField(term1365, term1365.getClass(), "baseUri", "RkybSrpybU");
        setIntField(term1365, term1365.getClass(), "siblingIndex", -616727354);
        HashMap term5499 = new HashMap();
        Set<Object> term5564 =  ((Map) term5499).keySet();
        HashSet term5498 = new HashSet((Collection<? extends Object>) term5564);
        HashMap term5500 = new HashMap();
        HashMap term5501 = new HashMap();
        HashMap term5502 = new HashMap();
        term5496 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        Object term5497 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term5497, term5497.getClass(), "tagNames", term5498);
        setField(term5497, term5497.getClass(), "attributes", term5500);
        setField(term5497, term5497.getClass(), "enforcedAttributes", term5501);
        setField(term5497, term5497.getClass(), "protocols", term5502);
        setBooleanField(term5497, term5497.getClass(), "preserveRelativeLinks", false);
        setField(term5496, term5496.getClass(), "whitelist", term5497);
        ArrayList term5507 = new ArrayList();
        ((ArrayList) term5507).add((Object)null);
        ((ArrayList) term5507).add((Object)null);
        ((ArrayList) term5507).add((Object)null);
        LinkedHashMap term5510 = new LinkedHashMap();
        term5503 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5504 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5509 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5504, term5504.getClass(), "tagName", "MxlszYVzRf");
        setBooleanField(term5504, term5504.getClass(), "isBlock", true);
        setBooleanField(term5504, term5504.getClass(), "formatAsBlock", true);
        setBooleanField(term5504, term5504.getClass(), "canContainBlock", true);
        setBooleanField(term5504, term5504.getClass(), "canContainInline", true);
        setBooleanField(term5504, term5504.getClass(), "empty", true);
        setBooleanField(term5504, term5504.getClass(), "selfClosing", true);
        setBooleanField(term5504, term5504.getClass(), "preserveWhitespace", false);
        setBooleanField(term5504, term5504.getClass(), "formList", true);
        setBooleanField(term5504, term5504.getClass(), "formSubmit", true);
        setField(term5503, term5503.getClass(), "tag", term5504);
        setField(term5503, term5503.getClass(), "parentNode", null);
        setField(term5503, term5503.getClass(), "childNodes", term5507);
        setField(term5509, term5509.getClass(), "attributes", term5510);
        setField(term5503, term5503.getClass(), "attributes", term5509);
        setField(term5503, term5503.getClass(), "baseUri", "ZiaGIbnzTs");
        setIntField(term5503, term5503.getClass(), "siblingIndex", -1922583790);
        ArrayList term5517 = new ArrayList();
        ((ArrayList) term5517).add((Object)null);
        ((ArrayList) term5517).add((Object)null);
        ((ArrayList) term5517).add((Object)null);
        ((ArrayList) term5517).add((Object)null);
        LinkedHashMap term5520 = new LinkedHashMap();
        term5513 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5514 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5519 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5514, term5514.getClass(), "tagName", "tbcdzjIfER");
        setBooleanField(term5514, term5514.getClass(), "isBlock", true);
        setBooleanField(term5514, term5514.getClass(), "formatAsBlock", true);
        setBooleanField(term5514, term5514.getClass(), "canContainBlock", false);
        setBooleanField(term5514, term5514.getClass(), "canContainInline", false);
        setBooleanField(term5514, term5514.getClass(), "empty", false);
        setBooleanField(term5514, term5514.getClass(), "selfClosing", true);
        setBooleanField(term5514, term5514.getClass(), "preserveWhitespace", true);
        setBooleanField(term5514, term5514.getClass(), "formList", false);
        setBooleanField(term5514, term5514.getClass(), "formSubmit", true);
        setField(term5513, term5513.getClass(), "tag", term5514);
        setField(term5513, term5513.getClass(), "parentNode", null);
        setField(term5513, term5513.getClass(), "childNodes", term5517);
        setField(term5519, term5519.getClass(), "attributes", term5520);
        setField(term5513, term5513.getClass(), "attributes", term5519);
        setField(term5513, term5513.getClass(), "baseUri", "RkybSrpybU");
        setIntField(term5513, term5513.getClass(), "siblingIndex", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = term1313;
        args[1] = term1365;
        Object retValue = callMethod(klass, "copySafeNodes", argTypes, term1289, args);
        assertTrue(recursiveEquals(term1289, term5496));
        assertTrue(recursiveEquals(term1313, term5503));
        assertTrue(recursiveEquals(term1365, term5513));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


