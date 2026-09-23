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
import java.lang.Object;
import java.util.ArrayList;

public class Element_before_69763949342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3000;

    public Element_before_69763949342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3026 = new ArrayList();
        ((ArrayList) term3026).add((Object)null);
        ((ArrayList) term3026).add((Object)null);
        ((ArrayList) term3026).add((Object)null);
        ((ArrayList) term3026).add((Object)null);
        ((ArrayList) term3026).add((Object)null);
        ((ArrayList) term3026).add((Object)null);
        ((ArrayList) term3026).add((Object)null);
        ((ArrayList) term3026).add((Object)null);
        term3000 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3001 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3022 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term3023 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3024 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term3030 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3032 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3033 = (Object[]) newArray("java.lang.String", 0);
        setField(term3001, term3001.getClass(), "tagName", "BKLfkLiZTH");
        setBooleanField(term3001, term3001.getClass(), "isBlock", true);
        setBooleanField(term3001, term3001.getClass(), "formatAsBlock", false);
        setBooleanField(term3001, term3001.getClass(), "canContainInline", true);
        setBooleanField(term3001, term3001.getClass(), "empty", true);
        setBooleanField(term3001, term3001.getClass(), "selfClosing", true);
        setBooleanField(term3001, term3001.getClass(), "preserveWhitespace", false);
        setBooleanField(term3001, term3001.getClass(), "formList", true);
        setBooleanField(term3001, term3001.getClass(), "formSubmit", false);
        setField(term3000, term3000.getClass(), "tag", term3001);
        setField(term3022, term3022.getClass(), "referent", null);
        setField(term3023, term3023.getClass(), "lock", term3024);
        setField(term3023, term3023.getClass(), "head", null);
        setLongField(term3023, term3023.getClass(), "queueLength", 4178434741742309755L);
        setField(term3022, term3022.getClass(), "queue", term3023);
        setField(term3022, term3022.getClass(), "next", null);
        setField(term3022, term3022.getClass(), "discovered", null);
        setField(term3000, term3000.getClass(), "shadowChildrenRef", term3022);
        setField(term3000, term3000.getClass(), "childNodes", term3026);
        setIntField(term3030, term3030.getClass(), "size", -1465035361);
        setField(term3030, term3030.getClass(), "keys", term3032);
        setField(term3030, term3030.getClass(), "vals", term3033);
        setField(term3000, term3000.getClass(), "attributes", term3030);
        setField(term3000, term3000.getClass(), "baseUri", "SPpkrGcPRr");
        setField(term3000, term3000.getClass(), "parentNode", null);
        setIntField(term3000, term3000.getClass(), "siblingIndex", 1090617576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sEccwbJKYE";
        callMethod(klass, "before", argTypes, term3000, args);
    }

};


