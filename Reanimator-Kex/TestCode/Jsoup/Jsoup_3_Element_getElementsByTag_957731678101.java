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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_getElementsByTag_957731678101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3410;
     Object term46358;
     Object term46353;

    public Element_getElementsByTag_957731678101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3432 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3432, term3432.getClass(), "tagName", null);
        setBooleanField(term3432, term3432.getClass(), "isBlock", true);
        setBooleanField(term3432, term3432.getClass(), "canContainBlock", false);
        setBooleanField(term3432, term3432.getClass(), "canContainInline", true);
        setBooleanField(term3432, term3432.getClass(), "optionalClosing", true);
        setBooleanField(term3432, term3432.getClass(), "empty", false);
        setBooleanField(term3432, term3432.getClass(), "preserveWhitespace", true);
        setField(term3432, term3432.getClass(), "ancestors", null);
        ArrayList term3430 = new ArrayList();
        ((ArrayList) term3430).add(term3432);
        ((ArrayList) term3430).add(term3432);
        HashMap term3442 = new HashMap();
        Set<Object> term46385 =  ((Map) term3442).keySet();
        HashSet term3441 = new HashSet((Collection<? extends Object>) term46385);
        ArrayList term3452 = new ArrayList();
        ((ArrayList) term3452).add((Object)null);
        ((ArrayList) term3452).add((Object)null);
        ((ArrayList) term3452).add((Object)null);
        LinkedHashMap term3457 = new LinkedHashMap();
        term3410 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3411 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3456 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3411, term3411.getClass(), "tagName", "DSFGlcaXUb");
        setBooleanField(term3411, term3411.getClass(), "isBlock", true);
        setBooleanField(term3411, term3411.getClass(), "canContainBlock", false);
        setBooleanField(term3411, term3411.getClass(), "canContainInline", false);
        setBooleanField(term3411, term3411.getClass(), "optionalClosing", false);
        setBooleanField(term3411, term3411.getClass(), "empty", false);
        setBooleanField(term3411, term3411.getClass(), "preserveWhitespace", false);
        setField(term3411, term3411.getClass(), "ancestors", term3430);
        setField(term3410, term3410.getClass(), "tag", term3411);
        setField(term3410, term3410.getClass(), "classNames", term3441);
        setField(term3410, term3410.getClass(), "parentNode", null);
        setField(term3410, term3410.getClass(), "childNodes", term3452);
        setField(term3456, term3456.getClass(), "attributes", term3457);
        setField(term3410, term3410.getClass(), "attributes", term3456);
        setField(term3410, term3410.getClass(), "baseUri", "bxyfeicqrK");
        Object term46364 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term46364, term46364.getClass(), "tagName", null);
        setBooleanField(term46364, term46364.getClass(), "isBlock", true);
        setBooleanField(term46364, term46364.getClass(), "canContainBlock", false);
        setBooleanField(term46364, term46364.getClass(), "canContainInline", true);
        setBooleanField(term46364, term46364.getClass(), "optionalClosing", true);
        setBooleanField(term46364, term46364.getClass(), "empty", false);
        setBooleanField(term46364, term46364.getClass(), "preserveWhitespace", true);
        setField(term46364, term46364.getClass(), "ancestors", null);
        ArrayList term46362 = new ArrayList();
        ((ArrayList) term46362).add(term46364);
        ((ArrayList) term46362).add(term46364);
        HashMap term46366 = new HashMap();
        Set<Object> term46416 =  ((Map) term46366).keySet();
        HashSet term46365 = new HashSet((Collection<? extends Object>) term46416);
        ArrayList term46367 = new ArrayList();
        ((ArrayList) term46367).add((Object)null);
        ((ArrayList) term46367).add((Object)null);
        ((ArrayList) term46367).add((Object)null);
        LinkedHashMap term46370 = new LinkedHashMap();
        term46358 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term46359 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term46369 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term46359, term46359.getClass(), "tagName", "DSFGlcaXUb");
        setBooleanField(term46359, term46359.getClass(), "isBlock", true);
        setBooleanField(term46359, term46359.getClass(), "canContainBlock", false);
        setBooleanField(term46359, term46359.getClass(), "canContainInline", false);
        setBooleanField(term46359, term46359.getClass(), "optionalClosing", false);
        setBooleanField(term46359, term46359.getClass(), "empty", false);
        setBooleanField(term46359, term46359.getClass(), "preserveWhitespace", false);
        setField(term46359, term46359.getClass(), "ancestors", term46362);
        setField(term46358, term46358.getClass(), "tag", term46359);
        setField(term46358, term46358.getClass(), "classNames", term46365);
        setField(term46358, term46358.getClass(), "parentNode", null);
        setField(term46358, term46358.getClass(), "childNodes", term46367);
        setField(term46369, term46369.getClass(), "attributes", term46370);
        setField(term46358, term46358.getClass(), "attributes", term46369);
        setField(term46358, term46358.getClass(), "baseUri", "bxyfeicqrK");
        ArrayList term46354 = new ArrayList();
        term46353 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term46353, term46353.getClass(), "contents", term46354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vBnWPlsZMk";
        Object retValue = callMethod(klass, "getElementsByTag", argTypes, term3410, args);
        assertTrue(recursiveEquals(term3410, term46358));
        assertTrue(recursiveEquals(retValue, term46353));
    }

};


