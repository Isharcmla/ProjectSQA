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

public class Element_tagName_171581085295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222;
     Object term9554;

    public Element_tagName_171581085295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term246 = new HashMap();
        Set<Object> term9576 =  ((Map) term246).keySet();
        HashSet term245 = new HashSet((Collection<? extends Object>) term9576);
        ArrayList term258 = new ArrayList();
        ((ArrayList) term258).add((Object)null);
        ((ArrayList) term258).add((Object)null);
        ((ArrayList) term258).add((Object)null);
        ((ArrayList) term258).add((Object)null);
        LinkedHashMap term263 = new LinkedHashMap();
        term222 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term223 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term262 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term223, term223.getClass(), "tagName", "tbcdzjIfER");
        setBooleanField(term223, term223.getClass(), "isBlock", false);
        setBooleanField(term223, term223.getClass(), "formatAsBlock", true);
        setBooleanField(term223, term223.getClass(), "canContainBlock", true);
        setBooleanField(term223, term223.getClass(), "canContainInline", true);
        setBooleanField(term223, term223.getClass(), "empty", true);
        setBooleanField(term223, term223.getClass(), "selfClosing", true);
        setBooleanField(term223, term223.getClass(), "preserveWhitespace", true);
        setBooleanField(term223, term223.getClass(), "formList", false);
        setBooleanField(term223, term223.getClass(), "formSubmit", true);
        setField(term222, term222.getClass(), "tag", term223);
        setField(term222, term222.getClass(), "classNames", term245);
        setField(term222, term222.getClass(), "parentNode", null);
        setField(term222, term222.getClass(), "childNodes", term258);
        setField(term262, term262.getClass(), "attributes", term263);
        setField(term222, term222.getClass(), "attributes", term262);
        setField(term222, term222.getClass(), "baseUri", "BYqFIqCKAV");
        setIntField(term222, term222.getClass(), "siblingIndex", 1162663216);
        HashMap term9559 = new HashMap();
        Set<Object> term9597 =  ((Map) term9559).keySet();
        HashSet term9558 = new HashSet((Collection<? extends Object>) term9597);
        ArrayList term9560 = new ArrayList();
        ((ArrayList) term9560).add((Object)null);
        ((ArrayList) term9560).add((Object)null);
        ((ArrayList) term9560).add((Object)null);
        ((ArrayList) term9560).add((Object)null);
        LinkedHashMap term9563 = new LinkedHashMap();
        term9554 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9555 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9562 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9555, term9555.getClass(), "tagName", "tbcdzjIfER");
        setBooleanField(term9555, term9555.getClass(), "isBlock", false);
        setBooleanField(term9555, term9555.getClass(), "formatAsBlock", true);
        setBooleanField(term9555, term9555.getClass(), "canContainBlock", true);
        setBooleanField(term9555, term9555.getClass(), "canContainInline", true);
        setBooleanField(term9555, term9555.getClass(), "empty", true);
        setBooleanField(term9555, term9555.getClass(), "selfClosing", true);
        setBooleanField(term9555, term9555.getClass(), "preserveWhitespace", true);
        setBooleanField(term9555, term9555.getClass(), "formList", false);
        setBooleanField(term9555, term9555.getClass(), "formSubmit", true);
        setField(term9554, term9554.getClass(), "tag", term9555);
        setField(term9554, term9554.getClass(), "classNames", term9558);
        setField(term9554, term9554.getClass(), "parentNode", null);
        setField(term9554, term9554.getClass(), "childNodes", term9560);
        setField(term9562, term9562.getClass(), "attributes", term9563);
        setField(term9554, term9554.getClass(), "attributes", term9562);
        setField(term9554, term9554.getClass(), "baseUri", "BYqFIqCKAV");
        setIntField(term9554, term9554.getClass(), "siblingIndex", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tagName", argTypes, term222, args);
        assertTrue(recursiveEquals(term222, term9554));
        assertTrue(recursiveEquals(retValue, "tbcdzjIfER"));
    }

};


