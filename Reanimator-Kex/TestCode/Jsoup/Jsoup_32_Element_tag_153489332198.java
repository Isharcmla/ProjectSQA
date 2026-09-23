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

public class Element_tag_153489332198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402;
     Object term10035;
     Object term9984;

    public Element_tag_153489332198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term424 = new HashMap();
        Set<Object> term10057 =  ((Map) term424).keySet();
        HashSet term423 = new HashSet((Collection<? extends Object>) term10057);
        ArrayList term434 = new ArrayList();
        ((ArrayList) term434).add((Object)null);
        ((ArrayList) term434).add((Object)null);
        ((ArrayList) term434).add((Object)null);
        ((ArrayList) term434).add((Object)null);
        ((ArrayList) term434).add((Object)null);
        ((ArrayList) term434).add((Object)null);
        LinkedHashMap term439 = new LinkedHashMap();
        term402 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term403 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term438 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term403, term403.getClass(), "tagName", "AijpHYOFuy");
        setBooleanField(term403, term403.getClass(), "isBlock", true);
        setBooleanField(term403, term403.getClass(), "formatAsBlock", true);
        setBooleanField(term403, term403.getClass(), "canContainBlock", true);
        setBooleanField(term403, term403.getClass(), "canContainInline", true);
        setBooleanField(term403, term403.getClass(), "empty", false);
        setBooleanField(term403, term403.getClass(), "selfClosing", false);
        setBooleanField(term403, term403.getClass(), "preserveWhitespace", false);
        setField(term402, term402.getClass(), "tag", term403);
        setField(term402, term402.getClass(), "classNames", term423);
        setField(term402, term402.getClass(), "parentNode", null);
        setField(term402, term402.getClass(), "childNodes", term434);
        setField(term438, term438.getClass(), "attributes", term439);
        setField(term402, term402.getClass(), "attributes", term438);
        setField(term402, term402.getClass(), "baseUri", "nyiiPDVjAc");
        setIntField(term402, term402.getClass(), "siblingIndex", 391863371);
        HashMap term10040 = new HashMap();
        Set<Object> term10078 =  ((Map) term10040).keySet();
        HashSet term10039 = new HashSet((Collection<? extends Object>) term10078);
        ArrayList term10041 = new ArrayList();
        ((ArrayList) term10041).add((Object)null);
        ((ArrayList) term10041).add((Object)null);
        ((ArrayList) term10041).add((Object)null);
        ((ArrayList) term10041).add((Object)null);
        ((ArrayList) term10041).add((Object)null);
        ((ArrayList) term10041).add((Object)null);
        LinkedHashMap term10044 = new LinkedHashMap();
        term10035 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10036 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10043 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10036, term10036.getClass(), "tagName", "AijpHYOFuy");
        setBooleanField(term10036, term10036.getClass(), "isBlock", true);
        setBooleanField(term10036, term10036.getClass(), "formatAsBlock", true);
        setBooleanField(term10036, term10036.getClass(), "canContainBlock", true);
        setBooleanField(term10036, term10036.getClass(), "canContainInline", true);
        setBooleanField(term10036, term10036.getClass(), "empty", false);
        setBooleanField(term10036, term10036.getClass(), "selfClosing", false);
        setBooleanField(term10036, term10036.getClass(), "preserveWhitespace", false);
        setField(term10035, term10035.getClass(), "tag", term10036);
        setField(term10035, term10035.getClass(), "classNames", term10039);
        setField(term10035, term10035.getClass(), "parentNode", null);
        setField(term10035, term10035.getClass(), "childNodes", term10041);
        setField(term10043, term10043.getClass(), "attributes", term10044);
        setField(term10035, term10035.getClass(), "attributes", term10043);
        setField(term10035, term10035.getClass(), "baseUri", "nyiiPDVjAc");
        setIntField(term10035, term10035.getClass(), "siblingIndex", 391863371);
        term9984 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9984, term9984.getClass(), "tagName", "AijpHYOFuy");
        setBooleanField(term9984, term9984.getClass(), "isBlock", true);
        setBooleanField(term9984, term9984.getClass(), "formatAsBlock", true);
        setBooleanField(term9984, term9984.getClass(), "canContainBlock", true);
        setBooleanField(term9984, term9984.getClass(), "canContainInline", true);
        setBooleanField(term9984, term9984.getClass(), "empty", false);
        setBooleanField(term9984, term9984.getClass(), "selfClosing", false);
        setBooleanField(term9984, term9984.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tag", argTypes, term402, args);
        assertTrue(recursiveEquals(term402, term10035));
        assertTrue(recursiveEquals(retValue, term9984));
    }

};


