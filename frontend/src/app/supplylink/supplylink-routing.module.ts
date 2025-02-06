import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
<<<<<<< HEAD
import { DashboardComponent } from "./components/dashboard/dashboard.component";
import { SupplierComponent } from "./components/supplier/supplier.component";
import { WarehouseComponent } from "./components/warehouse/warehouse.component";
import { ProductComponent } from "./components/product/product.component";
import { SupplierEditComponent } from "./components/supplieredit/supplieredit.component";
import { WarehouseEditComponent } from "./components/warehouseedit/warehouseedit.component";

const routes: Routes = [
  { path: "", component: DashboardComponent },
  { path: "supplier", component: SupplierComponent },
  { path: "warehouse", component: WarehouseComponent },
  { path: "product", component: ProductComponent },
  { path: "supplier/edit", component: SupplierEditComponent },
  { path: "warehouse/edit", component: WarehouseEditComponent },
];
=======

const routes: Routes = [];
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class SupplyLinkRoutingModule {}
