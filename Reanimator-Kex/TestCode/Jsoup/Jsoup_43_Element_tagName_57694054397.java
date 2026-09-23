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
import java.util.LinkedHashMap;

public class Element_tagName_57694054397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278;
     Object term9085;
     Object term9038;

    public Element_tagName_57694054397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term301 = new ArrayList();
        ((ArrayList) term301).add((Object)null);
        ((ArrayList) term301).add((Object)null);
        ((ArrayList) term301).add((Object)null);
        LinkedHashMap term306 = new LinkedHashMap();
        term278 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term279 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term305 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term279, term279.getClass(), "tagName", "tbcdzjIfER");
        setBooleanField(term279, term279.getClass(), "isBlock", true);
        setBooleanField(term279, term279.getClass(), "formatAsBlock", true);
        setBooleanField(term279, term279.getClass(), "canContainBlock", true);
        setBooleanField(term279, term279.getClass(), "canContainInline", false);
        setBooleanField(term279, term279.getClass(), "empty", false);
        setBooleanField(term279, term279.getClass(), "selfClosing", false);
        setBooleanField(term279, term279.getClass(), "preserveWhitespace", true);
        setBooleanField(term279, term279.getClass(), "formList", true);
        setBooleanField(term279, term279.getClass(), "formSubmit", false);
        setField(term278, term278.getClass(), "tag", term279);
        setField(term278, term278.getClass(), "parentNode", null);
        setField(term278, term278.getClass(), "childNodes", term301);
        setField(term305, term305.getClass(), "attributes", term306);
        setField(term278, term278.getClass(), "attributes", term305);
        setField(term278, term278.getClass(), "baseUri", "RkybSrpybU");
        setIntField(term278, term278.getClass(), "siblingIndex", 1484323161);
        ArrayList term9089 = new ArrayList();
        ((ArrayList) term9089).add((Object)null);
        ((ArrayList) term9089).add((Object)null);
        ((ArrayList) term9089).add((Object)null);
        LinkedHashMap term9092 = new LinkedHashMap();
        term9085 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9086 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9091 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9086, term9086.getClass(), "tagName", "xoeqzgamdu");
        setBooleanField(term9086, term9086.getClass(), "isBlock", false);
        setBooleanField(term9086, term9086.getClass(), "formatAsBlock", true);
        setBooleanField(term9086, term9086.getClass(), "canContainBlock", true);
        setBooleanField(term9086, term9086.getClass(), "canContainInline", true);
        setBooleanField(term9086, term9086.getClass(), "empty", false);
        setBooleanField(term9086, term9086.getClass(), "selfClosing", false);
        setBooleanField(term9086, term9086.getClass(), "preserveWhitespace", false);
        setBooleanField(term9086, term9086.getClass(), "formList", false);
        setBooleanField(term9086, term9086.getClass(), "formSubmit", false);
        setField(term9085, term9085.getClass(), "tag", term9086);
        setField(term9085, term9085.getClass(), "parentNode", null);
        setField(term9085, term9085.getClass(), "childNodes", term9089);
        setField(term9091, term9091.getClass(), "attributes", term9092);
        setField(term9085, term9085.getClass(), "attributes", term9091);
        setField(term9085, term9085.getClass(), "baseUri", "RkybSrpybU");
        setIntField(term9085, term9085.getClass(), "siblingIndex", 1484323161);
        ArrayList term9061 = new ArrayList();
        ((ArrayList) term9061).add((Object)null);
        ((ArrayList) term9061).add((Object)null);
        ((ArrayList) term9061).add((Object)null);
        LinkedHashMap term9066 = new LinkedHashMap();
        term9038 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9039 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9065 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9039, term9039.getClass(), "tagName", "xoeqzgamdu");
        setBooleanField(term9039, term9039.getClass(), "isBlock", false);
        setBooleanField(term9039, term9039.getClass(), "formatAsBlock", true);
        setBooleanField(term9039, term9039.getClass(), "canContainBlock", true);
        setBooleanField(term9039, term9039.getClass(), "canContainInline", true);
        setBooleanField(term9039, term9039.getClass(), "empty", false);
        setBooleanField(term9039, term9039.getClass(), "selfClosing", false);
        setBooleanField(term9039, term9039.getClass(), "preserveWhitespace", false);
        setBooleanField(term9039, term9039.getClass(), "formList", false);
        setBooleanField(term9039, term9039.getClass(), "formSubmit", false);
        setField(term9038, term9038.getClass(), "tag", term9039);
        setField(term9038, term9038.getClass(), "parentNode", null);
        setField(term9038, term9038.getClass(), "childNodes", term9061);
        setField(term9065, term9065.getClass(), "attributes", term9066);
        setField(term9038, term9038.getClass(), "attributes", term9065);
        setField(term9038, term9038.getClass(), "baseUri", "RkybSrpybU");
        setIntField(term9038, term9038.getClass(), "siblingIndex", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOEqzGAmDU";
        Object retValue = callMethod(klass, "tagName", argTypes, term278, args);
        assertTrue(recursiveEquals(term278, term9085));
        assertTrue(recursiveEquals(retValue, term9038));
    }

};


