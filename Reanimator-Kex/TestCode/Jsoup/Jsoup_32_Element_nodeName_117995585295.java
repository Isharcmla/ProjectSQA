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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_nodeName_117995585295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130;
     Object term9513;

    public Element_nodeName_117995585295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term152 = new HashMap();
        Set<Object> term9535 =  ((Map) term152).keySet();
        HashSet term151 = new HashSet((Collection<? extends Object>) term9535);
        ArrayList term166 = new ArrayList();
        ((ArrayList) term166).add((Object)null);
        ((ArrayList) term166).add((Object)null);
        ((ArrayList) term166).add((Object)null);
        ((ArrayList) term166).add((Object)null);
        LinkedHashMap term171 = new LinkedHashMap();
        term130 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term131 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term170 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term131, term131.getClass(), "tagName", "MjGYSRKTNF");
        setBooleanField(term131, term131.getClass(), "isBlock", false);
        setBooleanField(term131, term131.getClass(), "formatAsBlock", false);
        setBooleanField(term131, term131.getClass(), "canContainBlock", true);
        setBooleanField(term131, term131.getClass(), "canContainInline", true);
        setBooleanField(term131, term131.getClass(), "empty", false);
        setBooleanField(term131, term131.getClass(), "selfClosing", false);
        setBooleanField(term131, term131.getClass(), "preserveWhitespace", true);
        setField(term130, term130.getClass(), "tag", term131);
        setField(term130, term130.getClass(), "classNames", term151);
        setField(term130, term130.getClass(), "parentNode", null);
        setField(term130, term130.getClass(), "childNodes", term166);
        setField(term170, term170.getClass(), "attributes", term171);
        setField(term130, term130.getClass(), "attributes", term170);
        setField(term130, term130.getClass(), "baseUri", "ZiaGIbnzTs");
        setIntField(term130, term130.getClass(), "siblingIndex", 568599855);
        HashMap term9518 = new HashMap();
        Set<Object> term9556 =  ((Map) term9518).keySet();
        HashSet term9517 = new HashSet((Collection<? extends Object>) term9556);
        ArrayList term9519 = new ArrayList();
        ((ArrayList) term9519).add((Object)null);
        ((ArrayList) term9519).add((Object)null);
        ((ArrayList) term9519).add((Object)null);
        ((ArrayList) term9519).add((Object)null);
        LinkedHashMap term9522 = new LinkedHashMap();
        term9513 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9514 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9521 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9514, term9514.getClass(), "tagName", "MjGYSRKTNF");
        setBooleanField(term9514, term9514.getClass(), "isBlock", false);
        setBooleanField(term9514, term9514.getClass(), "formatAsBlock", false);
        setBooleanField(term9514, term9514.getClass(), "canContainBlock", true);
        setBooleanField(term9514, term9514.getClass(), "canContainInline", true);
        setBooleanField(term9514, term9514.getClass(), "empty", false);
        setBooleanField(term9514, term9514.getClass(), "selfClosing", false);
        setBooleanField(term9514, term9514.getClass(), "preserveWhitespace", true);
        setField(term9513, term9513.getClass(), "tag", term9514);
        setField(term9513, term9513.getClass(), "classNames", term9517);
        setField(term9513, term9513.getClass(), "parentNode", null);
        setField(term9513, term9513.getClass(), "childNodes", term9519);
        setField(term9521, term9521.getClass(), "attributes", term9522);
        setField(term9513, term9513.getClass(), "attributes", term9521);
        setField(term9513, term9513.getClass(), "baseUri", "ZiaGIbnzTs");
        setIntField(term9513, term9513.getClass(), "siblingIndex", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nodeName", argTypes, term130, args);
        assertTrue(recursiveEquals(term130, term9513));
        assertTrue(recursiveEquals(retValue, "MjGYSRKTNF"));
    }

};


