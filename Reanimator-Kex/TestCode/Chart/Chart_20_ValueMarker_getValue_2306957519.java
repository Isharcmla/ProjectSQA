package org.jfree.chart.plot;

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
import static org.jfree.chart.plot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.chart.plot.EqualityUtils.*;
import java.lang.Object;

public class ValueMarker_getValue_2306957519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;
     Object term1321;

    public ValueMarker_getValue_2306957519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term24 = newInstance(Class.forName("java.awt.Font"));
        Object term25 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term26 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term27 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term54 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        setDoubleField(term9, term9.getClass(), "value", 0.544608645520025);
        setField(term9, term9.getClass(), "paint", null);
        setField(term9, term9.getClass(), "stroke", null);
        setField(term9, term9.getClass(), "outlinePaint", null);
        setField(term9, term9.getClass(), "outlineStroke", null);
        setFloatField(term9, term9.getClass(), "alpha", 0.2707036F);
        setField(term9, term9.getClass(), "label", "PAEBtnZtTD");
        setIntField(term27, term27.getClass(), "hash", 602899587);
        setField(term27, term27.getClass(), "key", null);
        setField(term27, term27.getClass(), "value", null);
        setField(term27, term27.getClass(), "next", null);
        setElement(term26, 4, term27);
        setField(term25, term25.getClass(), "table", term26);
        setIntField(term25, term25.getClass(), "count", 1);
        setIntField(term25, term25.getClass(), "threshold", 8);
        setFloatField(term25, term25.getClass(), "loadFactor", 0.75F);
        setIntField(term25, term25.getClass(), "modCount", 1);
        setField(term25, term25.getClass(), "keySet", null);
        setField(term25, term25.getClass(), "entrySet", null);
        setField(term25, term25.getClass(), "values", null);
        setField(term24, term24.getClass(), "fRequestedAttributes", term25);
        setField(term24, term24.getClass(), "name", "sjlJAEtRrb");
        setIntField(term24, term24.getClass(), "style", 391863371);
        setIntField(term24, term24.getClass(), "size", -1922583790);
        setFloatField(term24, term24.getClass(), "pointSize", 0.3455959F);
        setField(term24, term24.getClass(), "peer", null);
        setLongField(term24, term24.getClass(), "pData", 2442117782898005296L);
        setField(term24, term24.getClass(), "font2DHandle", null);
        setField(term24, term24.getClass(), "values", null);
        setBooleanField(term24, term24.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term24, term24.getClass(), "createdFont", false);
        setBooleanField(term24, term24.getClass(), "nonIdentityTx", false);
        setIntField(term24, term24.getClass(), "hash", -616727354);
        setIntField(term24, term24.getClass(), "fontSerializedDataVersion", -1955890973);
        setLongField(term54, term54.getClass(), "timestamp", 0L);
        setField(term54, term54.getClass(), "referent", null);
        setField(term54, term54.getClass(), "queue", null);
        setField(term54, term54.getClass(), "next", null);
        setField(term54, term54.getClass(), "discovered", null);
        setField(term24, term24.getClass(), "flmref", term54);
        setField(term9, term9.getClass(), "labelFont", term24);
        setField(term9, term9.getClass(), "labelPaint", null);
        setField(term9, term9.getClass(), "labelAnchor", null);
        setField(term9, term9.getClass(), "labelTextAnchor", null);
        setField(term9, term9.getClass(), "labelOffset", null);
        setField(term9, term9.getClass(), "labelOffsetType", null);
        setField(term9, term9.getClass(), "listenerList", null);
        term1321 = newInstance(Class.forName("org.jfree.chart.plot.ValueMarker"));
        Object term1324 = newInstance(Class.forName("java.awt.Font"));
        Object term1325 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term1326 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term1327 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term1330 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        setDoubleField(term1321, term1321.getClass(), "value", 0.544608645520025);
        setField(term1321, term1321.getClass(), "paint", null);
        setField(term1321, term1321.getClass(), "stroke", null);
        setField(term1321, term1321.getClass(), "outlinePaint", null);
        setField(term1321, term1321.getClass(), "outlineStroke", null);
        setFloatField(term1321, term1321.getClass(), "alpha", 0.2707036F);
        setField(term1321, term1321.getClass(), "label", "PAEBtnZtTD");
        setIntField(term1327, term1327.getClass(), "hash", 602899587);
        setField(term1327, term1327.getClass(), "key", null);
        setField(term1327, term1327.getClass(), "value", null);
        setField(term1327, term1327.getClass(), "next", null);
        setElement(term1326, 4, term1327);
        setField(term1325, term1325.getClass(), "table", term1326);
        setIntField(term1325, term1325.getClass(), "count", 1);
        setIntField(term1325, term1325.getClass(), "threshold", 8);
        setFloatField(term1325, term1325.getClass(), "loadFactor", 0.75F);
        setIntField(term1325, term1325.getClass(), "modCount", 1);
        setField(term1325, term1325.getClass(), "keySet", null);
        setField(term1325, term1325.getClass(), "entrySet", null);
        setField(term1325, term1325.getClass(), "values", null);
        setField(term1324, term1324.getClass(), "fRequestedAttributes", term1325);
        setField(term1324, term1324.getClass(), "name", "sjlJAEtRrb");
        setIntField(term1324, term1324.getClass(), "style", 391863371);
        setIntField(term1324, term1324.getClass(), "size", -1922583790);
        setFloatField(term1324, term1324.getClass(), "pointSize", 0.3455959F);
        setField(term1324, term1324.getClass(), "peer", null);
        setLongField(term1324, term1324.getClass(), "pData", 2442117782898005296L);
        setField(term1324, term1324.getClass(), "font2DHandle", null);
        setField(term1324, term1324.getClass(), "values", null);
        setBooleanField(term1324, term1324.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term1324, term1324.getClass(), "createdFont", false);
        setBooleanField(term1324, term1324.getClass(), "nonIdentityTx", false);
        setIntField(term1324, term1324.getClass(), "hash", -616727354);
        setIntField(term1324, term1324.getClass(), "fontSerializedDataVersion", -1955890973);
        setLongField(term1330, term1330.getClass(), "timestamp", 0L);
        setField(term1330, term1330.getClass(), "referent", null);
        setField(term1330, term1330.getClass(), "queue", null);
        setField(term1330, term1330.getClass(), "next", null);
        setField(term1330, term1330.getClass(), "discovered", null);
        setField(term1324, term1324.getClass(), "flmref", term1330);
        setField(term1321, term1321.getClass(), "labelFont", term1324);
        setField(term1321, term1321.getClass(), "labelPaint", null);
        setField(term1321, term1321.getClass(), "labelAnchor", null);
        setField(term1321, term1321.getClass(), "labelTextAnchor", null);
        setField(term1321, term1321.getClass(), "labelOffset", null);
        setField(term1321, term1321.getClass(), "labelOffsetType", null);
        setField(term1321, term1321.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.ValueMarker");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term9, args);
        assertTrue(recursiveEquals(term9, term1321));
        assertTrue(recursiveEquals(retValue, 0.544608645520025));
    }

};


