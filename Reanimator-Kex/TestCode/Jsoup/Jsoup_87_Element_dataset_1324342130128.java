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

public class Element_dataset_1324342130128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1183;
     Object term59677;
     Object term59676;

    public Element_dataset_1324342130128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1209 = new ArrayList();
        ((ArrayList) term1209).add((Object)null);
        ((ArrayList) term1209).add((Object)null);
        ((ArrayList) term1209).add((Object)null);
        term1183 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1184 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1205 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term1206 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term1207 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term1213 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1215 = (Object[]) newArray("java.lang.String", 0);
        Object[] term1216 = (Object[]) newArray("java.lang.String", 0);
        setField(term1184, term1184.getClass(), "tagName", "nyiiPDVjAc");
        setBooleanField(term1184, term1184.getClass(), "isBlock", false);
        setBooleanField(term1184, term1184.getClass(), "formatAsBlock", true);
        setBooleanField(term1184, term1184.getClass(), "canContainInline", false);
        setBooleanField(term1184, term1184.getClass(), "empty", false);
        setBooleanField(term1184, term1184.getClass(), "selfClosing", true);
        setBooleanField(term1184, term1184.getClass(), "preserveWhitespace", true);
        setBooleanField(term1184, term1184.getClass(), "formList", true);
        setBooleanField(term1184, term1184.getClass(), "formSubmit", false);
        setField(term1183, term1183.getClass(), "tag", term1184);
        setField(term1205, term1205.getClass(), "referent", null);
        setField(term1206, term1206.getClass(), "lock", term1207);
        setField(term1206, term1206.getClass(), "head", null);
        setLongField(term1206, term1206.getClass(), "queueLength", -5476826692763582090L);
        setField(term1205, term1205.getClass(), "queue", term1206);
        setField(term1205, term1205.getClass(), "next", null);
        setField(term1205, term1205.getClass(), "discovered", null);
        setField(term1183, term1183.getClass(), "shadowChildrenRef", term1205);
        setField(term1183, term1183.getClass(), "childNodes", term1209);
        setIntField(term1213, term1213.getClass(), "size", -244121226);
        setField(term1213, term1213.getClass(), "keys", term1215);
        setField(term1213, term1213.getClass(), "vals", term1216);
        setField(term1183, term1183.getClass(), "attributes", term1213);
        setField(term1183, term1183.getClass(), "baseUri", "aKnKipADSo");
        setField(term1183, term1183.getClass(), "parentNode", null);
        setIntField(term1183, term1183.getClass(), "siblingIndex", -203030934);
        ArrayList term59684 = new ArrayList();
        ((ArrayList) term59684).add((Object)null);
        ((ArrayList) term59684).add((Object)null);
        ((ArrayList) term59684).add((Object)null);
        term59677 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term59678 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term59681 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term59682 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term59683 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term59686 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term59687 = (Object[]) newArray("java.lang.String", 0);
        Object[] term59688 = (Object[]) newArray("java.lang.String", 0);
        setField(term59678, term59678.getClass(), "tagName", "nyiiPDVjAc");
        setBooleanField(term59678, term59678.getClass(), "isBlock", false);
        setBooleanField(term59678, term59678.getClass(), "formatAsBlock", true);
        setBooleanField(term59678, term59678.getClass(), "canContainInline", false);
        setBooleanField(term59678, term59678.getClass(), "empty", false);
        setBooleanField(term59678, term59678.getClass(), "selfClosing", true);
        setBooleanField(term59678, term59678.getClass(), "preserveWhitespace", true);
        setBooleanField(term59678, term59678.getClass(), "formList", true);
        setBooleanField(term59678, term59678.getClass(), "formSubmit", false);
        setField(term59677, term59677.getClass(), "tag", term59678);
        setField(term59681, term59681.getClass(), "referent", null);
        setField(term59682, term59682.getClass(), "lock", term59683);
        setField(term59682, term59682.getClass(), "head", null);
        setLongField(term59682, term59682.getClass(), "queueLength", -5476826692763582090L);
        setField(term59681, term59681.getClass(), "queue", term59682);
        setField(term59681, term59681.getClass(), "next", null);
        setField(term59681, term59681.getClass(), "discovered", null);
        setField(term59677, term59677.getClass(), "shadowChildrenRef", term59681);
        setField(term59677, term59677.getClass(), "childNodes", term59684);
        setIntField(term59686, term59686.getClass(), "size", -244121226);
        setField(term59686, term59686.getClass(), "keys", term59687);
        setField(term59686, term59686.getClass(), "vals", term59688);
        setField(term59677, term59677.getClass(), "attributes", term59686);
        setField(term59677, term59677.getClass(), "baseUri", "aKnKipADSo");
        setField(term59677, term59677.getClass(), "parentNode", null);
        setIntField(term59677, term59677.getClass(), "siblingIndex", -203030934);
        term59676 = newInstance(Class.forName("org.jsoup.nodes.Attributes$Dataset"));
        Object term59649 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term59651 = (Object[]) newArray("java.lang.String", 0);
        Object[] term59652 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term59649, term59649.getClass(), "size", -244121226);
        setField(term59649, term59649.getClass(), "keys", term59651);
        setField(term59649, term59649.getClass(), "vals", term59652);
        setField(term59676, term59676.getClass(), "attributes", term59649);
        setField(term59676, term59676.getClass(), "keySet", null);
        setField(term59676, term59676.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "dataset", argTypes, term1183, args);
        assertTrue(recursiveEquals(term1183, term59677));
        assertTrue(recursiveEquals(retValue, term59676));
    }

};


