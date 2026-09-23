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
import java.lang.Object;
import java.util.ArrayList;

public class MultiplePiePlot_setDataset_12348917793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170;

    public MultiplePiePlot_setDataset_12348917793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term225 = new ArrayList();
        ArrayList term269 = new ArrayList();
        term170 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        Object term171 = newInstance(Class.forName("org.jfree.chart.JFreeChart"));
        Object term172 = newInstance(Class.forName("java.awt.RenderingHints"));
        Object term174 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term175 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term181 = newInstance(Class.forName("org.jfree.chart.title.TextTitle"));
        Object term184 = newInstance(Class.forName("java.awt.Font"));
        Object term195 = newInstance(Class.forName("org.jfree.chart.util.HorizontalAlignment"));
        Object term197 = newInstance(Class.forName("java.awt.Color"));
        Object term224 = newInstance(Class.forName("org.jfree.chart.text.TextBlock"));
        Object term229 = newInstance(Class.forName("org.jfree.chart.util.RectangleEdge"));
        Object term231 = newInstance(Class.forName("org.jfree.chart.util.VerticalAlignment"));
        Object term233 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term234 = (Object[]) newArray("java.lang.Object", 0);
        Object term248 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term253 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term254 = newInstance(Class.forName("java.awt.Color"));
        Object term257 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term264 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        Object term275 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term276 = (Object[]) newArray("java.lang.Object", 0);
        Object term277 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term278 = (Object[]) newArray("java.lang.Object", 0);
        Object term280 = newInstance(Class.forName("org.jfree.chart.util.TableOrder"));
        setField(term172, term172.getClass(), "hintmap", null);
        setField(term171, term171.getClass(), "renderingHints", term172);
        setBooleanField(term171, term171.getClass(), "borderVisible", false);
        setField(term171, term171.getClass(), "borderStroke", null);
        setField(term171, term171.getClass(), "borderPaint", null);
        setField(term175, term175.getClass(), "name", "");
        setField(term174, term174.getClass(), "unitType", term175);
        setDoubleField(term174, term174.getClass(), "top", 1.0);
        setDoubleField(term174, term174.getClass(), "left", 1.0);
        setDoubleField(term174, term174.getClass(), "bottom", 1.0);
        setDoubleField(term174, term174.getClass(), "right", 1.0);
        setField(term171, term171.getClass(), "padding", term174);
        setField(term181, term181.getClass(), "text", "");
        setField(term184, term184.getClass(), "fRequestedAttributes", null);
        setField(term184, term184.getClass(), "name", "");
        setIntField(term184, term184.getClass(), "style", 1);
        setIntField(term184, term184.getClass(), "size", 12);
        setFloatField(term184, term184.getClass(), "pointSize", 12.0F);
        setField(term184, term184.getClass(), "peer", null);
        setLongField(term184, term184.getClass(), "pData", 0L);
        setField(term184, term184.getClass(), "font2DHandle", null);
        setField(term184, term184.getClass(), "values", null);
        setBooleanField(term184, term184.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term184, term184.getClass(), "createdFont", false);
        setBooleanField(term184, term184.getClass(), "nonIdentityTx", false);
        setIntField(term184, term184.getClass(), "hash", 0);
        setIntField(term184, term184.getClass(), "fontSerializedDataVersion", 1);
        setField(term184, term184.getClass(), "flmref", null);
        setField(term181, term181.getClass(), "font", term184);
        setField(term195, term195.getClass(), "name", "");
        setField(term181, term181.getClass(), "textAlignment", term195);
        setIntField(term197, term197.getClass(), "value", -16777216);
        setField(term197, term197.getClass(), "frgbvalue", null);
        setField(term197, term197.getClass(), "fvalue", null);
        setFloatField(term197, term197.getClass(), "falpha", 0.0F);
        setField(term197, term197.getClass(), "cs", null);
        setField(term181, term181.getClass(), "paint", term197);
        setField(term181, term181.getClass(), "backgroundPaint", null);
        setField(term181, term181.getClass(), "toolTipText", "jJCZpVmanW");
        setField(term181, term181.getClass(), "urlText", "EGtDIRbSSb");
        setField(term224, term224.getClass(), "lines", term225);
        setField(term224, term224.getClass(), "lineAlignment", term195);
        setField(term181, term181.getClass(), "content", term224);
        setBooleanField(term181, term181.getClass(), "expandToFitSpace", true);
        setField(term229, term229.getClass(), "name", "");
        setField(term181, term181.getClass(), "position", term229);
        setField(term181, term181.getClass(), "horizontalAlignment", term195);
        setField(term231, term231.getClass(), "name", "");
        setField(term181, term181.getClass(), "verticalAlignment", term231);
        setField(term233, term233.getClass(), "listenerList", term234);
        setField(term181, term181.getClass(), "listenerList", term233);
        setBooleanField(term181, term181.getClass(), "notify", true);
        setField(term181, term181.getClass(), "id", "SzjVpOQTyS");
        setField(term248, term248.getClass(), "unitType", term175);
        setDoubleField(term248, term248.getClass(), "top", 0.0);
        setDoubleField(term248, term248.getClass(), "left", 0.0);
        setDoubleField(term248, term248.getClass(), "bottom", 0.0);
        setDoubleField(term248, term248.getClass(), "right", 0.0);
        setField(term181, term181.getClass(), "margin", term248);
        setField(term253, term253.getClass(), "insets", term248);
        setIntField(term254, term254.getClass(), "value", -1);
        setField(term254, term254.getClass(), "frgbvalue", null);
        setField(term254, term254.getClass(), "fvalue", null);
        setFloatField(term254, term254.getClass(), "falpha", 0.0F);
        setField(term254, term254.getClass(), "cs", null);
        setField(term253, term253.getClass(), "paint", term254);
        setField(term181, term181.getClass(), "frame", term253);
        setField(term257, term257.getClass(), "unitType", term175);
        setDoubleField(term257, term257.getClass(), "top", 1.0);
        setDoubleField(term257, term257.getClass(), "left", 1.0);
        setDoubleField(term257, term257.getClass(), "bottom", 1.0);
        setDoubleField(term257, term257.getClass(), "right", 1.0);
        setField(term181, term181.getClass(), "padding", term257);
        setDoubleField(term181, term181.getClass(), "width", 0.544608645520025);
        setDoubleField(term181, term181.getClass(), "height", 0.28570734989730284);
        setFloatField(term264, term264.getClass(), "x", 0.0F);
        setFloatField(term264, term264.getClass(), "y", 0.0F);
        setFloatField(term264, term264.getClass(), "width", 0.0F);
        setFloatField(term264, term264.getClass(), "height", 0.0F);
        setField(term181, term181.getClass(), "bounds", term264);
        setField(term171, term171.getClass(), "title", term181);
        setField(term171, term171.getClass(), "subtitles", term269);
        setField(term171, term171.getClass(), "plot", null);
        setField(term171, term171.getClass(), "backgroundPaint", null);
        setField(term171, term171.getClass(), "backgroundImage", null);
        setIntField(term171, term171.getClass(), "backgroundImageAlignment", 1162663216);
        setFloatField(term171, term171.getClass(), "backgroundImageAlpha", 0.2707036F);
        setField(term275, term275.getClass(), "listenerList", term276);
        setField(term171, term171.getClass(), "changeListeners", term275);
        setField(term277, term277.getClass(), "listenerList", term278);
        setField(term171, term171.getClass(), "progressListeners", term277);
        setBooleanField(term171, term171.getClass(), "notify", true);
        setField(term170, term170.getClass(), "pieChart", term171);
        setField(term170, term170.getClass(), "dataset", null);
        setField(term280, term280.getClass(), "name", "MjGYSRKTNF");
        setField(term170, term170.getClass(), "dataExtractOrder", term280);
        setDoubleField(term170, term170.getClass(), "limit", 0.40176586625454525);
        setField(term170, term170.getClass(), "aggregatedItemsKey", null);
        setField(term170, term170.getClass(), "aggregatedItemsPaint", null);
        setField(term170, term170.getClass(), "sectionPaints", null);
        setField(term170, term170.getClass(), "parent", null);
        setField(term170, term170.getClass(), "datasetGroup", null);
        setField(term170, term170.getClass(), "noDataMessage", null);
        setField(term170, term170.getClass(), "noDataMessageFont", null);
        setField(term170, term170.getClass(), "noDataMessagePaint", null);
        setField(term170, term170.getClass(), "insets", null);
        setBooleanField(term170, term170.getClass(), "outlineVisible", false);
        setField(term170, term170.getClass(), "outlineStroke", null);
        setField(term170, term170.getClass(), "outlinePaint", null);
        setField(term170, term170.getClass(), "backgroundPaint", null);
        setField(term170, term170.getClass(), "backgroundImage", null);
        setIntField(term170, term170.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term170, term170.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term170, term170.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term170, term170.getClass(), "backgroundAlpha", 0.0F);
        setField(term170, term170.getClass(), "drawingSupplier", null);
        setField(term170, term170.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.category.CategoryDataset");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDataset", argTypes, term170, args);
    }

};


