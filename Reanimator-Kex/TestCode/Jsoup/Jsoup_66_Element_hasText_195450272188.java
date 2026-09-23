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

public class Element_hasText_195450272188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6770;

    public Element_hasText_195450272188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6796 = new ArrayList();
        ((ArrayList) term6796).add((Object)null);
        ((ArrayList) term6796).add((Object)null);
        ((ArrayList) term6796).add((Object)null);
        ((ArrayList) term6796).add((Object)null);
        ((ArrayList) term6796).add((Object)null);
        ((ArrayList) term6796).add((Object)null);
        ((ArrayList) term6796).add((Object)null);
        ((ArrayList) term6796).add((Object)null);
        term6770 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6771 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6792 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term6793 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term6794 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term6800 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6802 = (Object[]) newArray("java.lang.String", 0);
        Object[] term6803 = (Object[]) newArray("java.lang.String", 0);
        setField(term6771, term6771.getClass(), "tagName", "zcorEihhLK");
        setBooleanField(term6771, term6771.getClass(), "isBlock", true);
        setBooleanField(term6771, term6771.getClass(), "formatAsBlock", false);
        setBooleanField(term6771, term6771.getClass(), "canContainInline", true);
        setBooleanField(term6771, term6771.getClass(), "empty", true);
        setBooleanField(term6771, term6771.getClass(), "selfClosing", false);
        setBooleanField(term6771, term6771.getClass(), "preserveWhitespace", false);
        setBooleanField(term6771, term6771.getClass(), "formList", true);
        setBooleanField(term6771, term6771.getClass(), "formSubmit", true);
        setField(term6770, term6770.getClass(), "tag", term6771);
        setField(term6792, term6792.getClass(), "referent", null);
        setField(term6793, term6793.getClass(), "lock", term6794);
        setField(term6793, term6793.getClass(), "head", null);
        setLongField(term6793, term6793.getClass(), "queueLength", 6005241913654469005L);
        setField(term6792, term6792.getClass(), "queue", term6793);
        setField(term6792, term6792.getClass(), "next", null);
        setField(term6792, term6792.getClass(), "discovered", null);
        setField(term6770, term6770.getClass(), "shadowChildrenRef", term6792);
        setField(term6770, term6770.getClass(), "childNodes", term6796);
        setIntField(term6800, term6800.getClass(), "size", -1122880881);
        setField(term6800, term6800.getClass(), "keys", term6802);
        setField(term6800, term6800.getClass(), "vals", term6803);
        setField(term6770, term6770.getClass(), "attributes", term6800);
        setField(term6770, term6770.getClass(), "baseUri", "GrqozDKFOk");
        setField(term6770, term6770.getClass(), "parentNode", null);
        setIntField(term6770, term6770.getClass(), "siblingIndex", -542712742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasText", argTypes, term6770, args);
    }

};


