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

public class MultiplePiePlot_getLimit_5573588338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1142;

    public MultiplePiePlot_getLimit_5573588338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1197 = new ArrayList();
        ArrayList term1241 = new ArrayList();
        term1142 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        Object term1143 = newInstance(Class.forName("org.jfree.chart.JFreeChart"));
        Object term1144 = newInstance(Class.forName("java.awt.RenderingHints"));
        Object term1146 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1147 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term1153 = newInstance(Class.forName("org.jfree.chart.title.TextTitle"));
        Object term1156 = newInstance(Class.forName("java.awt.Font"));
        Object term1167 = newInstance(Class.forName("org.jfree.chart.util.HorizontalAlignment"));
        Object term1169 = newInstance(Class.forName("java.awt.Color"));
        Object term1196 = newInstance(Class.forName("org.jfree.chart.text.TextBlock"));
        Object term1201 = newInstance(Class.forName("org.jfree.chart.util.RectangleEdge"));
        Object term1203 = newInstance(Class.forName("org.jfree.chart.util.VerticalAlignment"));
        Object term1205 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1206 = (Object[]) newArray("java.lang.Object", 0);
        Object term1220 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1225 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term1226 = newInstance(Class.forName("java.awt.Color"));
        Object term1229 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1236 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        Object term1247 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1248 = (Object[]) newArray("java.lang.Object", 0);
        Object term1249 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1250 = (Object[]) newArray("java.lang.Object", 0);
        Object term1252 = newInstance(Class.forName("org.jfree.chart.util.TableOrder"));
        setField(term1144, term1144.getClass(), "hintmap", null);
        setField(term1143, term1143.getClass(), "renderingHints", term1144);
        setBooleanField(term1143, term1143.getClass(), "borderVisible", true);
        setField(term1143, term1143.getClass(), "borderStroke", null);
        setField(term1143, term1143.getClass(), "borderPaint", null);
        setField(term1147, term1147.getClass(), "name", "");
        setField(term1146, term1146.getClass(), "unitType", term1147);
        setDoubleField(term1146, term1146.getClass(), "top", 1.0);
        setDoubleField(term1146, term1146.getClass(), "left", 1.0);
        setDoubleField(term1146, term1146.getClass(), "bottom", 1.0);
        setDoubleField(term1146, term1146.getClass(), "right", 1.0);
        setField(term1143, term1143.getClass(), "padding", term1146);
        setField(term1153, term1153.getClass(), "text", "");
        setField(term1156, term1156.getClass(), "fRequestedAttributes", null);
        setField(term1156, term1156.getClass(), "name", "");
        setIntField(term1156, term1156.getClass(), "style", 1);
        setIntField(term1156, term1156.getClass(), "size", 12);
        setFloatField(term1156, term1156.getClass(), "pointSize", 12.0F);
        setField(term1156, term1156.getClass(), "peer", null);
        setLongField(term1156, term1156.getClass(), "pData", 0L);
        setField(term1156, term1156.getClass(), "font2DHandle", null);
        setField(term1156, term1156.getClass(), "values", null);
        setBooleanField(term1156, term1156.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term1156, term1156.getClass(), "createdFont", false);
        setBooleanField(term1156, term1156.getClass(), "nonIdentityTx", false);
        setIntField(term1156, term1156.getClass(), "hash", 0);
        setIntField(term1156, term1156.getClass(), "fontSerializedDataVersion", 1);
        setField(term1156, term1156.getClass(), "flmref", null);
        setField(term1153, term1153.getClass(), "font", term1156);
        setField(term1167, term1167.getClass(), "name", "");
        setField(term1153, term1153.getClass(), "textAlignment", term1167);
        setIntField(term1169, term1169.getClass(), "value", -16777216);
        setField(term1169, term1169.getClass(), "frgbvalue", null);
        setField(term1169, term1169.getClass(), "fvalue", null);
        setFloatField(term1169, term1169.getClass(), "falpha", 0.0F);
        setField(term1169, term1169.getClass(), "cs", null);
        setField(term1153, term1153.getClass(), "paint", term1169);
        setField(term1153, term1153.getClass(), "backgroundPaint", null);
        setField(term1153, term1153.getClass(), "toolTipText", "IoAlmYsBwc");
        setField(term1153, term1153.getClass(), "urlText", "TEParAifyi");
        setField(term1196, term1196.getClass(), "lines", term1197);
        setField(term1196, term1196.getClass(), "lineAlignment", term1167);
        setField(term1153, term1153.getClass(), "content", term1196);
        setBooleanField(term1153, term1153.getClass(), "expandToFitSpace", true);
        setField(term1201, term1201.getClass(), "name", "");
        setField(term1153, term1153.getClass(), "position", term1201);
        setField(term1153, term1153.getClass(), "horizontalAlignment", term1167);
        setField(term1203, term1203.getClass(), "name", "");
        setField(term1153, term1153.getClass(), "verticalAlignment", term1203);
        setField(term1205, term1205.getClass(), "listenerList", term1206);
        setField(term1153, term1153.getClass(), "listenerList", term1205);
        setBooleanField(term1153, term1153.getClass(), "notify", true);
        setField(term1153, term1153.getClass(), "id", "OWDIEULEFu");
        setField(term1220, term1220.getClass(), "unitType", term1147);
        setDoubleField(term1220, term1220.getClass(), "top", 0.0);
        setDoubleField(term1220, term1220.getClass(), "left", 0.0);
        setDoubleField(term1220, term1220.getClass(), "bottom", 0.0);
        setDoubleField(term1220, term1220.getClass(), "right", 0.0);
        setField(term1153, term1153.getClass(), "margin", term1220);
        setField(term1225, term1225.getClass(), "insets", term1220);
        setIntField(term1226, term1226.getClass(), "value", -1);
        setField(term1226, term1226.getClass(), "frgbvalue", null);
        setField(term1226, term1226.getClass(), "fvalue", null);
        setFloatField(term1226, term1226.getClass(), "falpha", 0.0F);
        setField(term1226, term1226.getClass(), "cs", null);
        setField(term1225, term1225.getClass(), "paint", term1226);
        setField(term1153, term1153.getClass(), "frame", term1225);
        setField(term1229, term1229.getClass(), "unitType", term1147);
        setDoubleField(term1229, term1229.getClass(), "top", 1.0);
        setDoubleField(term1229, term1229.getClass(), "left", 1.0);
        setDoubleField(term1229, term1229.getClass(), "bottom", 1.0);
        setDoubleField(term1229, term1229.getClass(), "right", 1.0);
        setField(term1153, term1153.getClass(), "padding", term1229);
        setDoubleField(term1153, term1153.getClass(), "width", 0.4569171842750229);
        setDoubleField(term1153, term1153.getClass(), "height", 0.8598297828918529);
        setFloatField(term1236, term1236.getClass(), "x", 0.0F);
        setFloatField(term1236, term1236.getClass(), "y", 0.0F);
        setFloatField(term1236, term1236.getClass(), "width", 0.0F);
        setFloatField(term1236, term1236.getClass(), "height", 0.0F);
        setField(term1153, term1153.getClass(), "bounds", term1236);
        setField(term1143, term1143.getClass(), "title", term1153);
        setField(term1143, term1143.getClass(), "subtitles", term1241);
        setField(term1143, term1143.getClass(), "plot", null);
        setField(term1143, term1143.getClass(), "backgroundPaint", null);
        setField(term1143, term1143.getClass(), "backgroundImage", null);
        setIntField(term1143, term1143.getClass(), "backgroundImageAlignment", -2038273078);
        setFloatField(term1143, term1143.getClass(), "backgroundImageAlpha", 0.5254275F);
        setField(term1247, term1247.getClass(), "listenerList", term1248);
        setField(term1143, term1143.getClass(), "changeListeners", term1247);
        setField(term1249, term1249.getClass(), "listenerList", term1250);
        setField(term1143, term1143.getClass(), "progressListeners", term1249);
        setBooleanField(term1143, term1143.getClass(), "notify", true);
        setField(term1142, term1142.getClass(), "pieChart", term1143);
        setField(term1142, term1142.getClass(), "dataset", null);
        setField(term1252, term1252.getClass(), "name", "dWRymuLBtr");
        setField(term1142, term1142.getClass(), "dataExtractOrder", term1252);
        setDoubleField(term1142, term1142.getClass(), "limit", 0.43692187681405226);
        setField(term1142, term1142.getClass(), "aggregatedItemsKey", null);
        setField(term1142, term1142.getClass(), "aggregatedItemsPaint", null);
        setField(term1142, term1142.getClass(), "sectionPaints", null);
        setField(term1142, term1142.getClass(), "parent", null);
        setField(term1142, term1142.getClass(), "datasetGroup", null);
        setField(term1142, term1142.getClass(), "noDataMessage", null);
        setField(term1142, term1142.getClass(), "noDataMessageFont", null);
        setField(term1142, term1142.getClass(), "noDataMessagePaint", null);
        setField(term1142, term1142.getClass(), "insets", null);
        setBooleanField(term1142, term1142.getClass(), "outlineVisible", false);
        setField(term1142, term1142.getClass(), "outlineStroke", null);
        setField(term1142, term1142.getClass(), "outlinePaint", null);
        setField(term1142, term1142.getClass(), "backgroundPaint", null);
        setField(term1142, term1142.getClass(), "backgroundImage", null);
        setIntField(term1142, term1142.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term1142, term1142.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term1142, term1142.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term1142, term1142.getClass(), "backgroundAlpha", 0.0F);
        setField(term1142, term1142.getClass(), "drawingSupplier", null);
        setField(term1142, term1142.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLimit", argTypes, term1142, args);
    }

};


